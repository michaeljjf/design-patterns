package com.jiangjf.dp.chain;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jiangjf
 * @date 2022/2/19
 */
public class FilterChain {
    List<Filter> filters = new LinkedList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public void run(Message message) {
        for (Filter filter : filters) {
            filter.doFilter(message);
        }
    }
}
