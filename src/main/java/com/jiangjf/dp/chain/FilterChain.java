package com.jiangjf.dp.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangjf
 * @date 2022/2/19
 */
public class FilterChain {
    List<Filter> filters = new ArrayList<>();

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
