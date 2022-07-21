package com.greatlearning.VO;

import java.util.ArrayList;
import java.util.List;

import com.greatlearning.entity.Sales;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateListVO {
	List<Sales> sales= new ArrayList<>();

	public void setSales(List<Sales> saless) {
		sales.addAll(saless);
	}

}
