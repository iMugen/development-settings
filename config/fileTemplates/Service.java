/*
 * Created by IntelliJ IDEA File Templates.
 */

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

## 确保NAME首字母大写
#set ($validName = $NAME.substring(0, 1).toUpperCase() + $NAME.substring(1))
## 
## 确保以NAME以Service结尾
#if (!$validName.endsWith("Service"))
    #set ($validName = $validName + "Service")
#else
    #set ($validName = $validName)
#end
## Model名称
#set ($modelName = $validName.replace("Service", ""))
#set ($lowerModelName = $modelName.substring(0, 1).toLowerCase() + $modelName.substring(1))

/**
 * 
 *
 * @author Deolin $YEAR/$MONTH/$DAY
 */
public interface $validName extends CommonService<$modelName> {
}