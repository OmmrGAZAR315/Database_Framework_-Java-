import DB.QBResults;
import DB.QueryBuilder;

public class Main {
    public static void main(String[] args) {
        QBResults results = new QueryBuilder()
                .table("employees")
                .insert("EmployeeID", "FirstName", "LastName", "BirthDate", "HireDate", "Salary")
                .setParameter(1)
                .setParameter("John")
                .setParameter("Doe")
                .setParameter("1980-01-15")
                .setParameter("2020-02-20")
                .setParameter(55000.00)
                .build();
        System.out.println(results.getStatusCode());
        System.out.println(results.getMessage());
        System.out.println(results.first());
        results = new QueryBuilder()
                .table("employees")
                .select("EmployeeID", "FirstName", "LastName", "BirthDate", "HireDate", "Salary")
                .setParameter(1)
                .setParameter("John")
                .setParameter("Doe")
                .setParameter("1980-01-15")
                .setParameter("2020-02-20")
                .setParameter(55000.00)
                .build();
        System.out.println(results.getStatusCode());
        System.out.println(results.getMessage());
        System.out.println(results.first());
    }
}
