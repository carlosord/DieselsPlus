package ${package}.persistence.util;

import java.util.List;

public class QueryUtils {

    public static <T> T firstOrNull(List<T> list) {
        return list.size() == 0 ? null : list.get(0);
    }

}
