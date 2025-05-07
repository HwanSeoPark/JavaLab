package com.intheeast.generics.typeinference.sub;

public interface Converter<U, T> {
	T convert(U input);
}
