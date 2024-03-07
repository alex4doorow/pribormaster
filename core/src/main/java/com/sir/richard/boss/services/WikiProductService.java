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
public class WikiProductService {

    private List<ProductCategory> categories = new ArrayList<>();

    @Autowired
    private TeWikiProductCategoryRepository wikiProductCategoryRepository;

    @PostConstruct
    public void init() {
        log.info("WikiService: {}", "start");
        categories = instanceCategories();
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<ProductCategory> categories) {
        this.categories = categories;
    }

    public ProductCategory getCategoryById(Long categoryId) {
        if (categories == null) {
            return null;
        }
        for (ProductCategory category: categories) {
            if (categoryId == category.getId()) {
                return category;
            }
        }
        return null;
    }

    public BigDecimal ejectTotalAmountsByConditions(OrderAmountTypes amountType, Pair<LocalDate> period) {
        return BigDecimal.ZERO;
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
