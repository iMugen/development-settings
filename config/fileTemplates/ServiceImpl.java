/*
 * Created by IntelliJ IDEA File Templates.
 */

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

## 确保NAME首字母大写
#set ($validName = $NAME.substring(0, 1).toUpperCase() + $NAME.substring(1))
## 
## 确保以NAME以ServiceImpl结尾
#if (!$validName.endsWith("ServiceImpl"))
    #set ($validName = $validName + "ServiceImpl")
#else
    #set ($validName = $validName)
#end
## Model名称
#set ($modelName = $validName.replace("ServiceImpl", ""))
#set ($lowerModelName = $modelName.substring(0, 1).toLowerCase() + $modelName.substring(1))

import org.springframework.stereotype.Service;
import lombok.extern.log4j.Log4j2;

/**
 * 
 *
 * @author Deolin $YEAR/$MONTH/$DAY
 */
@Service
@Log4j2
public class $validName extends CommonServiceImpl<$modelName> implements ${modelName}Service {

	// @Autowired
	// private ${modelName}Mapper ${lowerModelName}Mapper;

}