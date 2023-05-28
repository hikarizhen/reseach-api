/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.32).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-05-28T12:59:09.311Z")

@Validated
@Api(value = "hello", description = "the hello API")
@RequestMapping(value = "")
public interface HelloApi {

    @ApiOperation(value = "", nickname = "helloUserGet", notes = "ユーザに挨拶する。", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "異常発生", response = String.class),
        @ApiResponse(code = 400, message = "引数「user」に違法文字があります。") })
    @RequestMapping(value = "/hello/{user}",
        method = RequestMethod.GET)
    ResponseEntity<String> helloUserGet(@ApiParam(value = "ユーザ名前.",required=true) @PathVariable("user") String user);

}