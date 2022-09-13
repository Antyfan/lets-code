import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.Map;

// should be reviewed as a spring component
@Component
class Company {

    Double total;

    public Report process(Map<String, Double> employeesSalaries, Map<String, Double> employeesBonuses) {
        total = 0D;
        for(Map.Entry<String, Double> employeeSalary : employeesSalaries.entrySet()) {
            double bonus = 0;
            for(Map.Entry<String, Double> employeeBonus : employeesBonuses.entrySet()) {
                if(employeeSalary.getKey().equals(employeeBonus.getKey())) {
                  bonus = employeeBonus.getValue();
                }
                total += employeeSalary.getValue() * bonus;
            }
        }
        return new Report(total, new Date());
    }
    
    @Data
    @Builder
    class Report {
        Double revenue;
        Date date;
    }
}
