package io.mosip.kernel.clientcrypto.dto;


import io.mosip.kernel.keymanagerservice.constant.KeymanagerConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(description = "Model representing request for signature verification")
public class TpmSignVerifyRequestDto {

    /**
     * Data in BASE64 encoding
     */
    @ApiModelProperty(notes = "Data corresponding to signature", required = true)
    @NotBlank(message = KeymanagerConstant.INVALID_REQUEST)
    private String data;

    /**
     * Signature in BASE64 encoding
     */
    @ApiModelProperty(notes = "Signature", required = true)
    @NotBlank(message = KeymanagerConstant.INVALID_REQUEST)
    private String signature;


}