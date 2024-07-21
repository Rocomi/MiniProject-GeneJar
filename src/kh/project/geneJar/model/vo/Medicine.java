package kh.project.geneJar.model.vo;

public class Medicine {
	
	private String name;
	private String med;
	private String formulation;
	private String target;
	private int medNo;
	private int prodCost;
	private int inven;
	
	public Medicine() {
		super();
	}
	
	
	public Medicine(String med, String formulation, int medNo) {
		super();
		this.med = med;
		this.formulation = formulation;
		this.medNo = medNo;
	}


	public Medicine(String name, String med, String formulation, String target, int medNo, int prodCost, int inven) {
		super();
		this.name = name;
		this.med = med;
		this.formulation = formulation;
		this.target = target;
		this.medNo = medNo;
		this.inven = inven;
	}
	
	public String sumeInfo() {
		return "제품명 : "+ med + ", 제형 : "+ formulation + ", 효능 : "+target+", 남은 수량 : "+inven;
	}

	@Override
	public String toString() {
		return "약품명 =" + name + ", 제품명=" + med + ", 제형=" + formulation + ", 효능=" + target
				+ ", 약품번호=" + medNo +", 생산비용="+ prodCost + ", 재고수량=" + inven;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMed() {
		return med;
	}

	public void setMed(String med) {
		this.med = med;
	}

	public String getFormulation() {
		return formulation;
	}

	public void setFormulation(String formulation) {
		this.formulation = formulation;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getMedNo() {
		return medNo;
	}

	public void setMedNo(int medNo) {
		this.medNo = medNo;
	}

	public int getInven() {
		return inven;
	}
	
	public void setProdCost(int prodCost) {
		this.prodCost = prodCost;
	}
	
	public int getProdCost() {
		return prodCost;
	}

	public void setInven(int inven) {
		this.inven = inven;
	}

	
}
