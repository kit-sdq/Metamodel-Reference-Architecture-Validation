package metamodelcomprehensionextentassessor.helpers;

import java.io.PrintWriter;
import java.io.StringWriter;

public class JavaHelper {

    private JavaHelper() {
    }

    public static String stackTraceToString(Throwable throwable) {
        StringWriter errors = new StringWriter();
        throwable.printStackTrace(new PrintWriter(errors));
        return errors.toString();
    }
}
