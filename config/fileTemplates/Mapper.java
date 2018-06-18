/*
 * Created by IntelliJ IDEA File Templates.
 */

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

## 确保NAME首字母大写
#set ($validName = $NAME.substring(0, 1).toUpperCase() + $NAME.substring(1))
## 
## 确保以NAME以Mapper结尾
#if (!$validName.endsWith("Mapper"))
    #set ($validName = $validName + "Mapper")
#else
    #set ($validName = $validName)
#end
## Model名称
#set ($modelName = $validName.replace("Mapper", ""))
#set ($lowerModelName = $modelName.substring(0, 1).toLowerCase() + $modelName.substring(1))

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 *
 * @author $USER $YEAR/$MONTH/$DAY
 */
@Mapper
public interface $validName extends CommonMapper<$modelName> {
}