package com.sir.richard.boss.services.integrations.im;

import com.sir.richard.boss.bl.entity.TeProduct;
import com.sir.richard.boss.bl.jpa.TeProductRepository;
import com.sir.richard.boss.utils.DateTimeUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

@Service
@Slf4j
public class ProductConnector {

    @Autowired
    private TeProductRepository productRepository;

    public void loadProducts(DataSource primaryDataSource, Connection secondaryConnection) {
        final String selectProductsSql = "select * from oc_product where synchronized is null and product_id > ? order by product_id";
        final String selectProductDescriptionSql = "select * from oc_product_description where product_id = ?";
        final String selectStockSql = "select * from sr_stock where product_id = ?";
        final String selectProductSpecialSql = "select * from oc_product_special where product_id = ?";
        try {
            PreparedStatement ps = secondaryConnection.prepareStatement(selectProductsSql);
            ps.setInt(1, 0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Optional<TeProduct> teProduct = productRepository.findById(rs.getLong("product_id"));
                if (teProduct.isPresent()) {
                    continue;
                }
                log.info("product id: {}", rs.getLong("product_id"));
                final String sqlInsertProduct = "INSERT INTO oc_product " +
                        "(product_id, model, sku, upc, ean, jan, isbn, mpn, location, quantity, stock_status_id, image, manufacturer_id, " +
                        " shipping, price, points, tax_class_id, date_available, weight, weight_class_id, length, width, height, length_class_id, " +
                        " subtract, minimum, sort_order, status, viewed, date_added, date_modified, category_group_id, composite, delivery_name)\n" +
                        "VALUES" +
                        "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                        " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, " +
                        " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                JdbcTemplate jdbcTemplate = new JdbcTemplate(primaryDataSource);
                jdbcTemplate.update(sqlInsertProduct, rs.getLong("product_id"),
                        rs.getString("model"),
                        rs.getString("sku"),
                        rs.getString("upc"),
                        rs.getString("ean"),
                        rs.getString("jan"),
                        rs.getString("isbn"),
                        rs.getString("mpn"),
                        rs.getString("location"),
                        rs.getInt("quantity"),
                        rs.getInt("stock_status_id"),
                        rs.getString("image"),
                        rs.getInt("manufacturer_id"),
                        rs.getInt("shipping"),
                        rs.getBigDecimal("price"),
                        rs.getInt("points"),
                        rs.getInt("tax_class_id"),
                        rs.getDate("date_available"),
                        rs.getBigDecimal("weight"),
                        rs.getInt("weight_class_id"),
                        rs.getBigDecimal("length"),
                        rs.getBigDecimal("width"),
                        rs.getBigDecimal("height"),
                        rs.getInt("length_class_id"),
                        rs.getInt("subtract"),
                        rs.getInt("minimum"),
                        rs.getInt("sort_order"),
                        rs.getInt("status"),
                        rs.getInt("viewed"),
                        rs.getDate("date_added"),
                        rs.getDate("date_modified"),
                        rs.getInt("category_group_id"),
                        rs.getInt("composite"),
                        rs.getString("delivery_name"));

                PreparedStatement psDescription = secondaryConnection.prepareStatement(selectProductDescriptionSql);
                psDescription.setInt(1, rs.getInt("product_id"));
                ResultSet rsDescription = psDescription.executeQuery();
                while (rsDescription.next()) {
                    /*
                    final String sqlSelectProductDescriptionCount = "SELECT COUNT(*) COUNT_ID FROM OC_PRODUCT_DESCRIPTION P WHERE P.PRODUCT_ID = ?";
                    JdbcTemplate jdbcTemplateProductDescriptionCount = new JdbcTemplate(primaryDataSource);
                    int countProduct = jdbcTemplateProductDescriptionCount.queryForObject(sqlSelectProductDescriptionCount,
                            new Object[]{ rs.getInt("product_id") },
                            new int[] { Types.INTEGER },
                            new RowMapper<>() {
                                @Override
                                public Integer mapRow(ResultSet rs, int rowNum) throws SQLException {
                                    return rs.getInt("COUNT_ID");
                                }
                            });
                    if (countProduct > 0) {
                        log.error("oc_product_description > 0: {}", rs.getInt("product_id"));
                        continue;
                    }

                    */
                    final String sqlInsertProductDescription = "INSERT INTO oc_product_description" +
                            "(product_id, language_id, name, description, tag, meta_title, meta_description, meta_keyword)\n" +
                            "VALUES " +
                            "(?, ?, ?, ?, ?, ?, ?, ?)";
                    JdbcTemplate jdbcTemplateDescription = new JdbcTemplate(primaryDataSource);
                    jdbcTemplateDescription.update(sqlInsertProductDescription, rsDescription.getLong("product_id"),
                            rsDescription.getLong("language_id"),
                            rsDescription.getString("name"),
                            rsDescription.getString("description"),
                            rsDescription.getString("tag"),
                            rsDescription.getString("meta_title"),
                            rsDescription.getString("meta_description"),
                            rsDescription.getString("meta_keyword"));
                }
                rsDescription.close();
                psDescription.close();
                PreparedStatement psStock = secondaryConnection.prepareStatement(selectStockSql);
                psStock.setInt(1, rs.getInt("product_id"));
                ResultSet rsStock = psStock.executeQuery();
                while (rsStock.next()) {
                    final String sqlInsertStock = "INSERT INTO sr_stock\n" +
                            "(id, product_id, stock_id, supplier_id, supplier_price, quantity, comment, supplier_quantity)" +
                            "VALUES " +
                            "(?, ?, ?, ?, ?, ?, ?, ?)";
                    JdbcTemplate jdbcTemplateStock = new JdbcTemplate(primaryDataSource);
                    jdbcTemplateStock.update(sqlInsertStock, rsStock.getLong("id"),
                            rsStock.getLong("product_id"),
                            rsStock.getLong("stock_id"),
                            rsStock.getLong("supplier_id"),
                            rsStock.getBigDecimal("supplier_price"),
                            rsStock.getLong("quantity"),
                            rsStock.getString("comment"),
                            rsStock.getInt("supplier_quantity"));
                }
                rsStock.close();
                psStock.close();
                PreparedStatement psProductSpecial = secondaryConnection.prepareStatement(selectProductSpecialSql);
                psProductSpecial.setInt(1, rs.getInt("product_id"));
                ResultSet rsProductSpecial = psProductSpecial.executeQuery();
                while (rsProductSpecial.next()) {
                    final String sqlInsertProductSpecial = "INSERT INTO oc_product_special" +
                            "(product_special_id, product_id, customer_group_id, priority, price, date_start, date_end)" +
                            "VALUES" +
                            "(?, ?, ?, ?, ?, ?, ?)";
                    JdbcTemplate jdbcTemplateProductSpecial = new JdbcTemplate(primaryDataSource);

                    java.util.Date dateStart;
                    java.util.Date dateEnd;
                    String sDateStart = rsProductSpecial.getString("date_start");
                    if ("0000-00-00".equals(sDateStart)) {
                        dateStart = DateTimeUtils.defaultFormatStringToDate("01.01.1970");
                    } else {
                        dateStart = rsProductSpecial.getDate("date_start");
                    }
                    String sDateEnd = rsProductSpecial.getString("date_end");
                    if ("0000-00-00".equals(sDateEnd)) {
                        dateEnd = DateTimeUtils.defaultFormatStringToDate("01.01.2099");
                    } else {
                        dateEnd = rsProductSpecial.getDate("date_end");
                    }
                    jdbcTemplateProductSpecial.update(sqlInsertProductSpecial, rsProductSpecial.getLong("product_special_id"),
                            rsProductSpecial.getLong("product_id"),
                            rsProductSpecial.getLong("customer_group_id"),
                            rsProductSpecial.getLong("priority"),
                            rsProductSpecial.getBigDecimal("price"),
                            dateStart,
                            dateEnd);
                }
                rsProductSpecial.close();
                psProductSpecial.close();
                setSecondaryProductSynchronized(secondaryConnection, rs.getInt("product_id"));
            }
            rs.close();
            ps.close();
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }

    private void setSecondaryProductSynchronized(Connection secondaryConnection, int productId) {
        final String updateProductSql = "UPDATE oc_product set synchronized = 1 where PRODUCT_ID = ?";

        try (PreparedStatement preparedStatement = secondaryConnection.prepareStatement(updateProductSql)) {
            preparedStatement.setInt(1, productId);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
    }
}
