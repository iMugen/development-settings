#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
#parse("File Header.java")

## 确保NAME首字母大写
#set ($validName = $NAME.substring(0, 1).toUpperCase() + $NAME.substring(1))
## 
## 确保以NAME以Test结尾
#if (!$validName.endsWith("Test"))
    #set ($validName = $validName + "Test")
#else
    #set ($validName = $validName)
#end

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@Log4j2
public class $validName {

    @Test
    @SneakyThrows
    public void t() {
        //
        log.info("结束");
    }

}