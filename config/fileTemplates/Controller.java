/*
 * Created by IntelliJ IDEA File Templates.
 */
#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")

## 确保NAME首字母大写
#set ($validName = $NAME.substring(0, 1).toUpperCase() + $NAME.substring(1))
## 
## 确保以NAME以Controller结尾
#if (!$validName.endsWith("Controller"))
    #set ($validName = $validName + "Controller")
#else
    #set ($validName = $validName)
#end
## Model名称
#set ($modelName = $validName.replace("Controller", ""))
#set ($lowerModelName = $modelName.substring(0, 1).toLowerCase() + $modelName.substring(1))
## Model名称转化为snake分割（将所有大写字符前面加下划线，然后字符串转小写，最后删除第一个下划线）
#set( $regex = "([A-Z])")
#set( $replacement = "_$1")
#set( $classMapping = $modelName.replaceAll($regex, $replacement).toLowerCase().substring(1))

import java.util.List;
import javax.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
#if ($Description != "") * $Description
 *
#end * @author $USER $YEAR/$MONTH/$DAY
 */
@RestController
@RequestMapping("$classMapping")
@Validated
public class $validName {

    // @Autowired
    // private ${modelName}Service ${lowerModelName}Service;

    /**
     * 
     */
    @PostMapping("/")
    public RequestResult create(@RequestBody @Valid Void input) {
        
        return RequestResult.success();
    }

    /**
     * 
     */
    @GetMapping("/{id}")
    public RequestResult get(@PathVariable Long id) {
        return RequestResult.success();
    }

    /**
     * 
     */
    @PutMapping("/{id}")
    public RequestResult update(@PathVariable Long id, @RequestBody @Valid Void input) {
        
        return RequestResult.success();
    }

    /**
     * 
     */
    @DeleteMapping("/{id}")
    public RequestResult delete(@PathVariable Long id) {
        
        return RequestResult.success();
    }

    /**
     * 
     */
    @GetMapping("/")
    public RequestResult page(Integer pageNo, Integer pageSize) {
        return RequestResult.success();
    }

}