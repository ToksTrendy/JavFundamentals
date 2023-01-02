package practice.schoolportal.datastore;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseDatastore {
    public static int baseOperation = 1;

    public static void ensureIdIsValid(ArrayList arrayList, int id) {
        if(arrayList.isEmpty() ||id == 0 || arrayList.size() < id ) {
            System.out.println("Invalid id");
            System.exit(0);
        }
    }

    public static void printList(ArrayList arrayList) {
        System.out.println(arrayList);
    }

    public static void validateCreatedIndex(int createdIndex, int id) {
        if (createdIndex + 1 != id) {
            System.out.println("Admin could not be created because of Id mismatch");
            System.exit(0);
        }
    }
    public static void view(List list, String message) {
        if (list.isEmpty()) {
            System.out.println("List is empty, please select another option");
        }else {
            StringBuilder sb = new StringBuilder(message);
            sb.append("\n");
            for (int i = 0; i < list.size(); i++) {
                    sb.append("[")
                            .append(list.get(i).toString())
                            .append("]\n");
            }
            System.out.println(sb);
        }
    }

    public static int getNewId(List list) { //
        return list.size() + 1;
    }

}
