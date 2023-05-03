package com.sir.richard.boss.services;

import com.sir.richard.boss.model.types.OrderAmountTypes;
import com.sir.richard.boss.utils.Pair;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class WikiService {

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
}
