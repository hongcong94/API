package com.vti.specification;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import com.vti.dto.ClassFilter;
import com.vti.entity.Class;

public class ClassSpecificationBuilder {

	private DateInClassFilter filter;
	private String search;

	public ClassSpecificationBuilder(DateInClassFilter filter, String search) {
		this.filter = filter;
		this.search = search;
	}

	@SuppressWarnings("deprecation")
	public Specification<Class> build() {

		// Search ClassName
		// Search ClassName
		SearchCriteria searchCriteria = new SearchCriteria("className", "Like", search);

		// Filter Date
		SearchCriteria minDateCriteria = new SearchCriteria("startDate", ">", filter.getStartDate());

		SearchCriteria maxDateCriteria = new SearchCriteria("endDate", "<", filter.getEndDate());

		Specification<Class> where = null;

		// Check null search
		if (!StringUtils.isEmpty(search)) {
			where = new ClassSpecification(searchCriteria);
		}

		// Filter
		if (filter.getEndDate() != null) {
			if (where != null) {
				// "and" la where1 + where2 (lay ca filter va search. Co the dung "or" tuy
				// logic)
				where = where.and(new ClassSpecification(minDateCriteria));
			} else {
				where = new ClassSpecification(maxDateCriteria);
			}

		}

		if (filter.getStartDate() != null) {
			if (where != null) {
				// "and" la where1 + where2 (lay ca filter va search. Co the dung "or" tuy
				// logic)
				where = where.and(new ClassSpecification(maxDateCriteria));
			} else {
				where = new ClassSpecification(minDateCriteria);
			}

		}
		return where;

	}

}
