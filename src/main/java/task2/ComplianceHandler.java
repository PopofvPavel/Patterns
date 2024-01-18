package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComplianceHandler extends BaseHandler {
    public ComplianceHandler() {
        setMessage("Клиент находится в черном списке");
    }

    @Override
    public boolean tryProcessRequest(Request request) {
        List<String> blackList = getBlackList();
        String email = request.getEmail();
        for (String blackListEmail : blackList) {
            if (blackListEmail.equals(email)) {
                return false;
            }
        }
        return true;
    }

    private List<String> getBlackList() {
        return new ArrayList<>(Arrays.asList("scumman@mail.ru", "badman@mail.ru"));
    }
}
