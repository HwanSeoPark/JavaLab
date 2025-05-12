package com.intheeast.interfaces;

// 디폴트로 extends Object가 적용되어 있음.
// explicit, implicit
// extends 키워드 : 상속[inheritance]
public class ImplGroupedInterface /*extends Object*/ implements GroupedInterface {

	private double NatureConstant = GroupedInterface.E;
	
//	@Override
	public Integer interfaceMethod1(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public String interfaceMethod2(String a, String b) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public Integer interface2Method1(Integer a, String b) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public String interface2Method2(String a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public Double interface3Method1(Double a, Byte b) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
	public Float interface3Method2(Float a, Float b) {
		// TODO Auto-generated method stub
		return null;
	}



}
