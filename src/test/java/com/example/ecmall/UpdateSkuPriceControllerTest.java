package com.example.ecmall;

import com.example.ecmall.controller.SupplierController;
import com.example.ecmall.dto.BaseResponse;
import com.example.ecmall.dto.SkuPriceRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;

public class UpdateSkuPriceControllerTest {

    @Test
    void testUpdateSkuPrice_Success() {
        SupplierController controller = new SupplierController();
        SkuPriceRequest request = new SkuPriceRequest();
        String token = "validToken";

        ResponseEntity<BaseResponse> response = controller.updateSkuPrice(token, request);

        assertNotNull(response);
        assertEquals(200, response.getStatusCodeValue());
        assertTrue(response.getBody().isSuccess());
        assertEquals("200", response.getBody().getResultCode());
        assertEquals("操作成功", response.getBody().getResultMessage());
    }

    @Test
    @Disabled
    void testUpdateSkuPrice_NullToken() {
        SupplierController controller = new SupplierController();
        SkuPriceRequest request = new SkuPriceRequest();

        assertThrows(NullPointerException.class, () -> {
            controller.updateSkuPrice(null, request);
        });
    }

    @Test
    @Disabled
    void testUpdateSkuPrice_NullRequest() {
        SupplierController controller = new SupplierController();
        String token = "validToken";

        assertThrows(NullPointerException.class, () -> {
            controller.updateSkuPrice(token, null);
        });
    }
}
