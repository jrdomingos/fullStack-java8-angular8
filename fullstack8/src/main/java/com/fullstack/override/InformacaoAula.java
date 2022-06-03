package com.fullstack.override;

@interface InformacaoAula {
	
	public String autor();
	
	public int aulaNumero();
	
	public String blog() default "http//jrd.com";
	
	public String site() default "http//jrd.training";

}
