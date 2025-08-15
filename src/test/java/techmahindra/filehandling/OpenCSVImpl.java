package techmahindra.filehandling;/*
package filehandling;


import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

import java.io.FileReader;
import java.util.List;

public class OpenCSVImpl {
    private static final String SAMPLE_CSV_FILE_PATH = "./sr";
    public static void main(String x[]){
        try {
            HeaderColumnNameMappingStrategy<EmployeeVO> beanStrategy = new HeaderColumnNameMappingStrategy<EmployeeVO>();
            beanStrategy.setType(EmployeeVO.class);
            CsvToBean<EmployeeVO> csvToBean = new CsvToBean<EmployeeVO>();
            CSVReader reader = new CSVReader(new FileReader(SAMPLE_CSV_FILE_PATH));
            List<EmployeeVO> emps = csvToBean.parse(beanStrategy, reader);
            System.out.println(emps);
        }catch(Exception ex){
            System.out.println(ex.getCause().getMessage());
        }
    }
}
*/
