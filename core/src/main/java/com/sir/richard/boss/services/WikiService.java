package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.jpa.TeWikiProductCategoryRepository;
import com.sir.richard.boss.model.data.ProductCategory;
import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.utils.Pair;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class WikiService {

    private List<ProductCategory> categories = new ArrayList<>();

    @Autowired
    private TeWikiProductCategoryRepository wikiProductCategoryRepository;

    @PostConstruct
    public void init() {
        // TODO schedules with products
        log.info("WikiService: {}", "start");
        categories = instanceCategories();
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ProductCategory> categories) {
        this.categories = categories;
    }

    public BigDecimal ejectTotalAmountsByConditions(OrderAmountTypes amountType, Pair<LocalDate> period) {
        return BigDecimal.ZERO;

        /*
        final String sqlSelectTotalAmounts = "SELECT SUM(amount) SUM_AMOUNT FROM sr_period_total_amount pta"
                + "  WHERE pta.amount_type = ? "
                + "    AND pta.period_in between ? and ?";
        BigDecimal sumAmount = this.jdbcTemplate.queryForObject(sqlSelectTotalAmounts,
                new Object[] { amountType.getId(), period.getStart(), period.getEnd() },
                new int[] { Types.INTEGER, Types.DATE, Types.DATE },
                new RowMapper<BigDecimal>() {
                    @Override
                    public BigDecimal mapRow(ResultSet rs, int rowNum) throws SQLException {
                        return rs.getBigDecimal("SUM_AMOUNT");
                    }
                });
        return sumAmount == null ? BigDecimal.ZERO : sumAmount;

         */
    }

    private List<ProductCategory> instanceCategories() {
        return wikiProductCategoryRepository.findAll()
                .stream()
                .map(teWikiProductCategory -> {
            ProductCategory productCategory = new ProductCategory(teWikiProductCategory.getId(),
                    teWikiProductCategory.getAnnotation());
            return productCategory;
        }).toList();
    }
}
