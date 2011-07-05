package com.netappsid.jpaquery.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public interface Join {

	void appendSelect(StringBuilder builder, AtomicInteger incrementor);

	String getJoin(String alias, AtomicInteger incrementor);

	List<Parameter> getParams();

}
