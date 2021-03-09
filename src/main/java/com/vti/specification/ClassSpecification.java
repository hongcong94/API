package com.vti.specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.vti.entity.Class;

public class ClassSpecification implements Specification<Class> {

	private static final long serialVersionUID = 1L;
	private SearchCriteria criteria;

	public ClassSpecification(SearchCriteria criteria) {
		this.criteria = criteria;
	}

	@Override
	public Predicate toPredicate(Root<Class> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {

		if (criteria.getOperation().equalsIgnoreCase("Like")) {
			return criteriaBuilder.like(root.get(criteria.getKey()), "%" + criteria.getValue() + "%");
		}
		if (criteria.getOperation().equalsIgnoreCase(">")) {
			return criteriaBuilder.greaterThan(root.get(criteria.getKey()), criteria.getValue().toString());
		}
		if (criteria.getOperation().equalsIgnoreCase("<")) {
			return criteriaBuilder.lessThan(root.get(criteria.getKey()), criteria.getValue().toString());
		}
		return null;
	}


}
