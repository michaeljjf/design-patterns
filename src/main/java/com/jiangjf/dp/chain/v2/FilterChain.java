package com.jiangjf.dp.chain.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangjf
 * @date 2022/3/29
 */
public class FilterChain {
    List<Filter> filters = new ArrayList<>();
    int index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return false;
        }
        Filter filter = filters.get(index);
        index++;
        return filter.doFilter(request, response, this);
    }
}
