/*
 * Created by IntelliJ IDEA File Templates.
 */

#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

## 确保NAME首字母大写
#set ($validName = $NAME.substring(0, 1).toUpperCase() + $NAME.substring(1))
## 
## 确保以NAME以DTO、Input、PO或VO结尾，缺省为以DTO结尾
#if (!$validName.endsWith("DTO")
        && !$validName.endsWith("Input")
        && !$validName.endsWith("PO")
        && !$validName.endsWith("VO"))
    #set ($validName = $validName + "DTO")
#else
    #set ($validName = $validName)
#end

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 *
 * @author $USER $YEAR/$MONTH/$DAY
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class $validName implements Serializable {

    

    private static final long serialVersionUID = 1L;

}