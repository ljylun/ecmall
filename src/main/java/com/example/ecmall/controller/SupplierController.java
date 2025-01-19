package com.example.ecmall.controller;

import com.alibaba.fastjson.JSON;
import com.example.ecmall.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ecmall.dto.OrderInfoResponse.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/openApi/provider/api")
public class SupplierController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(SupplierController.class);

    // 1.1 获取 Access Token
    @PostMapping("/auth/accessToken")
    public ResponseEntity<AccessTokenResponse> getAccessToken(@RequestBody AccessTokenRequest request) {
        log.info("获取token请求报文：{}", JSON.toJSONString(request));
        AccessTokenResponse response = new AccessTokenResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        AccessTokenResponse.AccessTokenResult result = new AccessTokenResponse.AccessTokenResult();
        result.setAccessToken("2145de52c04eacdf687740e800698113");
        result.setRefreshToken("bd6a8a3bf7a8a5487f66ab07c2e59723");
        response.setResult(result);
        log.info("获取token返回报文：{}",JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }

    // 1.2 刷新 Access Token
    @PostMapping("/auth/refreshToken")
    public ResponseEntity<RefreshTokenResponse> refreshToken(@RequestBody RefreshTokenRequest request) {
        log.info("刷新token请求报文：{}", JSON.toJSONString(request));
        RefreshTokenResponse response = new RefreshTokenResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        RefreshTokenResponse.RefreshTokenResult result = new RefreshTokenResponse.RefreshTokenResult();
        result.setAccessToken("abd897e04e8332540292947a5104ae90");
        result.setRefreshToken("bd6a8a3bf7a8a5487f66ab07c2e59723");
        response.setResult(result);
        log.info("刷新token返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }

    // 2.1 商品推送接口
    @PostMapping(value = "/importGoodsInfo", headers = "token")
    public ResponseEntity<BaseResponse> importGoodsInfo(@RequestHeader("token")String token,@RequestBody GoodsInfoRequest request) {
        log.info("商品推送接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("商品推送接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }

    // 2.2 更新商品基本信息接口
    @PostMapping(value = "/updateGoodsInfo", headers = "token")
    public ResponseEntity<BaseResponse> updateGoodsInfo(@RequestHeader("token")String token,@RequestBody GoodsInfoRequest request) {
        log.info("更新商品基本信息接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("更新商品基本信息接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 2.3 根据商品 sku 更新商品图片信息接口
    @PostMapping(value = "/updateSkuImgInfo", headers = "token")
    public ResponseEntity<BaseResponse> updateSkuImgInfo(@RequestHeader("token")String token,@RequestBody SkuImgInfoRequest request) {
        log.info("根据商品 sku 更新商品图片信息接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("根据商品 sku 更新商品图片信息接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 2.4 根据商品 sku 更新商品价格
    @PostMapping(value = "/updateSkuPrice", headers = "token")
    public ResponseEntity<BaseResponse> updateSkuPrice(@RequestHeader("token")String token,@RequestBody SkuPriceRequest request) {
        log.info("根据商品 sku 更新商品价格请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("根据商品 sku 更新商品价格返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 2.5 根据商品 sku 更新商品上下架状态
    @PostMapping(value = "/updateSkuStateInfo", headers = "token")
    public ResponseEntity<BaseResponse> updateSkuStateInfo(@RequestHeader("token")String token,@RequestBody SkuStateRequest request) {
        log.info("根据商品 sku 更新商品上下架状态请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("根据商品 sku 更新商品上下架状态返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }

    // 2.6 查询商品状态接口
    @PostMapping(value = "/getGoodsStatus", headers = "token")
    public ResponseEntity<GoodsStatusResponse> getGoodsStatus(@RequestHeader("token")String token,@RequestBody GoodsStatusRequest request) {
        log.info("查询商品状态接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        GoodsStatusResponse response = new GoodsStatusResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<GoodsStatusResponse.GoodsStatusResult> resultList = Arrays.asList(
                new GoodsStatusResponse.GoodsStatusResult("112233445566",0,0,null,null),
                new GoodsStatusResponse.GoodsStatusResult("100950473507",1,1,null,null)
        );
        response.setResult(resultList);
        log.info("查询商品状态接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 2.7 查询商品分类信息接口
    @PostMapping(value = "/getGoodsCategory", headers = "token")
    public ResponseEntity<GoodsCategoryResponse> getGoodsCategory(@RequestHeader("token")String token) {
        log.info("查询商品分类信息接口请求报文,token:{}",token);
        GoodsCategoryResponse response = new GoodsCategoryResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<GoodsCategoryResponse.GoodsCategoryResult> resultList = Arrays.asList(
                new GoodsCategoryResponse.GoodsCategoryResult("1337589245888378121","工装专区","0", Arrays.asList(
                    new GoodsCategoryResponse.GoodsCategoryResult("1337666768513386274","工装","1337589245888378121",Arrays.asList(
                       new GoodsCategoryResponse.GoodsCategoryResult("1337632878608829581","POLO衫","1337666768513386274", Collections.emptyList()),
                        new GoodsCategoryResponse.GoodsCategoryResult("1337640503064564318","反光背心","1337666768513386274",Collections.emptyList()),
                        new GoodsCategoryResponse.GoodsCategoryResult("1337666212468825831","工作服","1337666768513386274",Collections.emptyList()),
                        new GoodsCategoryResponse.GoodsCategoryResult("1337677915912363952","正装","1337666768513386274",Collections.emptyList()),
                        new GoodsCategoryResponse.GoodsCategoryResult("1337630208519205997","衬衫","1337666768513386274",Collections.emptyList())
                    ))
                ))
        );
        response.setResult(resultList);
        log.info("查询商品分类信息接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 2.8 获取商品分类详情
    @PostMapping(value = "/queryCategoryAttrByCode", headers = "token")
    public ResponseEntity<CategoryAttrResponse> queryCategoryAttrByCode(@RequestHeader("token")String token, @RequestBody CategoryAttrRequest request) {
        log.info("获取商品分类详情请求报文：{},token:{}", JSON.toJSONString(request),token);
        CategoryAttrResponse response = new CategoryAttrResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        CategoryAttrResponse.CategoryAttrResult result = new CategoryAttrResponse.CategoryAttrResult("1337642023966763543","劳保用品",null,"0",1,1);
        response.setResult(result);
        log.info("获取商品分类详情返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 2.9 查询商品品牌信息接口
    @PostMapping(value = "/getGoodsBrand", headers = "token")
    public ResponseEntity<GoodsBrandResponse> getGoodsBrand(@RequestHeader("token")String token, @RequestBody(required = false) GoodsBrandRequest request) {
        log.info("查询商品品牌信息接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        GoodsBrandResponse response = new GoodsBrandResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<GoodsBrandResponse.GoodsBrandResult> resultList = Arrays.asList(
            new GoodsBrandResponse.GoodsBrandResult(1337997682011741552L,"田丸屋"),
                new GoodsBrandResponse.GoodsBrandResult(1338678252316769150L,"鲁普"),
                new GoodsBrandResponse.GoodsBrandResult(1338821805819760530L,"奋迅"),
                new GoodsBrandResponse.GoodsBrandResult(1338883907340416302L,"都霖文昊"),
                new GoodsBrandResponse.GoodsBrandResult(1338937182717024221L,"兴伟建材"),
                new GoodsBrandResponse.GoodsBrandResult(1339031137984332459L,"靖康(JINGK)"),
                new GoodsBrandResponse.GoodsBrandResult(1753947279251460098L,"美菱(MeiLing)"),
                new GoodsBrandResponse.GoodsBrandResult(1753947298310377473L,"西门子(SIEMENS)")
        );
        response.setResult(resultList);
        log.info("查询商品品牌信息接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 2.10 查询商品商城码(暂未启用)
    @PostMapping(value = "/getGoodsStandard", headers = "token")
    public ResponseEntity<GoodsStandardResponse> getGoodsStandard(@RequestHeader("token")String token,@RequestBody GoodsStandardRequest request) {
        log.info("查询商品商城码(暂未启用)请求报文：{},token:{}", JSON.toJSONString(request),token);
        GoodsStandardResponse response = new GoodsStandardResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<GoodsStandardResponse.GoodsStandardResult> resultList = Arrays.asList(
                new GoodsStandardResponse.GoodsStandardResult("1160258303155041771","1337590181586307063, 1337685654052596569, 1337588660129225848","WHJJ1670729001930870785","得力 美工刀(湖南地区专供) 得力 2004 大号美工刀 100126912"),
                 new GoodsStandardResponse.GoodsStandardResult("1160311283155603910","1337590181586307063, 1337685654052596569, 1337588660129225848","2979583","得力(deli) 切割片 DL1501222H 150*1.2*22mm 树脂黑色片"),
                 new GoodsStandardResponse.GoodsStandardResult("1750804397162586114","1337590181586307063, 1337685654052596569, 1337588660129225848","YF12222","衣服服饰")

        );
        response.setResult(resultList);
        log.info("查询商品商城码(暂未启用)返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }


    // 3.1 获取订单明细信息
    @PostMapping(value = "/queryOrderInfo", headers = "token")
    public ResponseEntity<OrderInfoResponse> queryOrderInfo(@RequestHeader("token")String token,@RequestBody OrderInfoRequest request) {
         log.info("获取订单明细信息接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        OrderInfoResponse response = new OrderInfoResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        OrderInfoResponse.OrderInfoResult result = new OrderInfoResponse.OrderInfoResult();
        result.setOrderSn("");
        result.setMemberName("张三");
        result.setMobile("");
        result.setTwoTypeName("");
        result.setFenTypeName("");
        result.setDepartmentName("");
        result.setOrderStatus("0");
        result.setPayType("0");
        result.setPayStatus("1");
        result.setOrderSuccessTime("");
        result.setConsigneeName("张三");
        result.setConsigneeMobile("13512345678");
        result.setConsigneeAddressPath("黑龙江,哈尔滨市, 呼兰区,南京路街道");
        result.setConsigneeAddressIdPath("10, 698, 45814, 129365");
        result.setConsigneeDetail("科技路123号");
        result.setFlowPrice(new BigDecimal("15060.0"));
        result.setNoTaxPrice(null);
        result.setTaxPrice(null);
        result.setRealAmount(new BigDecimal("15060.0"));
        result.setDrawback(null);
        result.setRemark("");
        result.setInvoiceRemark("");
        result.setCancelReason(null);
        result.setCompleteTime(null);
        result.setCustomerServiceEndTime(null);
        result.setClientType("PC");
        result.setInvoiceAddressName("");
        result.setInvoiceAddressMobile("");
        result.setInvoiceAddressPostCode("");
        result.setInvoiceAddressAreaId("");
        result.setInvoiceAddressAreaName("");
        result.setInvoiceAddress("");
        result.setInvoiceTitle("");
        result.setBankName("");
        result.setBankAccount("");
        result.setTaxNo("");
        result.setAddress("");
        result.setTelephone("");
        result.setSettlementStatus("0");
        result.setOrderType("0");
        List<OrderItemResult> orderItemList = Arrays.asList(
            new OrderItemResult(1,"A01222344",Arrays.asList(
                new OrderItemResult.SkuListResult("skulll","华为Mate50 白色",1,new BigDecimal("15060.0"),"件")
            ))
        );
        result.setOrderItemList(orderItemList);
        response.setResult(result);
        log.info("获取订单明细信息接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 3.2 推送订单发货接口
    @PostMapping(value = "/sendDeliveryInfo", headers = "token")
    public ResponseEntity<SendDeliveryResponse> sendDeliveryInfo(@RequestHeader("token")String token,@RequestBody SendDeliveryRequest request) {
        log.info("推送订单发货接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        SendDeliveryResponse response = new SendDeliveryResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage(null);
        SendDeliveryResponse.SendDeliveryResult result = new SendDeliveryResponse.SendDeliveryResult("DN-20231105184641237-204");
        response.setResult(result);
        log.info("推送订单发货接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 3.3 根据发货单号查询发货单详情接口
    @PostMapping(value = "/querySendOrderInfo", headers = "token")
    public ResponseEntity<QuerySendOrderResponse> querySendOrderInfo(@RequestHeader("token")String token,@RequestBody QuerySendOrderRequest request) {
        log.info("根据发货单号查询发货单详情接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        QuerySendOrderResponse response = new QuerySendOrderResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
         List<QuerySendOrderResponse.QuerySendOrderResult> resultList = Arrays.asList(
                 new QuerySendOrderResponse.QuerySendOrderResult("DN-20231105184641237-204","2023-11-05 18:46:41","PO-111-20231102162304449201",new BigDecimal("15060.0"),"1",null,"code","圆通快递","YT123456","1",null,"2023-12-11 00:03:58",Arrays.asList(
                     new QuerySendOrderResponse.QuerySendOrderResult.SkuListResult("sku100","华为Mate50 白色",new BigDecimal("15060.0"),1)
                 )),
                 new QuerySendOrderResponse.QuerySendOrderResult("DN-20230915180142958-144","2023-09-15 18:01:42","PO-111-2023091013342432434",new BigDecimal("15060.0"),"2","http://*.com/rest/chinaunicom/api/logistics?action=Logistics&sendOrderNo=8001879058","code","自有物流名称","code123456","1","2023-09-15 18:01:42",null,Arrays.asList(
                         new QuerySendOrderResponse.QuerySendOrderResult.SkuListResult("skulll","华为Mate50 黑色",new BigDecimal("15060.0"),1)
                 ))
         );
        response.setResult(resultList);
        log.info("根据发货单号查询发货单详情接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 3.4 根据订单号查询售后信息
    @PostMapping(value = "/getAfterSaleDetail", headers = "token")
    public ResponseEntity<AfterSaleDetailResponse> getAfterSaleDetail(@RequestHeader("token")String token, @RequestBody AfterSaleDetailRequest request) {
        log.info("根据订单号查询售后信息接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        AfterSaleDetailResponse response = new AfterSaleDetailResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<AfterSaleDetailResponse.AfterSaleResult> resultList = Arrays.asList(
            new AfterSaleDetailResponse.AfterSaleResult("2","2",null,"张三","AS-jiajiale-20240204154559783780","1","2024-02-04 15:45:59",
                    "http://**/group1/default/20230608/14/05/2/58c9c0a62534326794fcc0c7637ff14e.png,http://**/group1/default/20230608/14/05/2/58c9c0a62534326794fcc0c7637ff14e.png",Arrays.asList(
                new AfterSaleDetailResponse.AfterSaleResult.SkuListResult("skulll","",new BigDecimal("15060.0"),1,new BigDecimal("15.0"))
            ))
        );
        response.setResult(resultList);
        log.info("根据订单号查询售后信息接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }

    // 3.5 供应商售后审批(通过/驳回)
    @PostMapping(value = "/sendUntreadResult", headers = "token")
    public ResponseEntity<BaseResponse> sendUntreadResult(@RequestHeader("token")String token,@RequestBody UntreadResultRequest request) {
        log.info("供应商售后审批(通过/驳回)请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("供应商售后审批(通过/驳回)返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }

    // 3.6 查询物流公司
    @PostMapping(value = "/queryLogisticsComs", headers = "token")
    public ResponseEntity<LogisticsComsResponse> queryLogisticsComs(@RequestHeader("token")String token, @RequestBody(required = false) LogisticsComsRequest request) {
        log.info("查询物流公司请求报文：{},token:{}", JSON.toJSONString(request),token);
        LogisticsComsResponse response = new LogisticsComsResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<LogisticsComsResponse.LogisticsComsResult> resultList = Arrays.asList(
            new LogisticsComsResponse.LogisticsComsResult("novaposhta","Nova Poshta"),
                new LogisticsComsResponse.LogisticsComsResult("szuem","联运通物流"),
                new LogisticsComsResponse.LogisticsComsResult("iceland","冰岛(Iceland Post)"),
                new LogisticsComsResponse.LogisticsComsResult("quantium","Quantium"),
                new LogisticsComsResponse.LogisticsComsResult("gzxingcheng","贵州星程快递"),
                new LogisticsComsResponse.LogisticsComsResult("redur_es","Redur Spain"),
                new LogisticsComsResponse.LogisticsComsResult("greenland","格陵兰[丹麦](TELE Greenland A/S)"),
                new LogisticsComsResponse.LogisticsComsResult("xhongda56","新宏达物流"),
                new LogisticsComsResponse.LogisticsComsResult("mascourierservice","MAS Courier Servic"),
                new LogisticsComsResponse.LogisticsComsResult("dfpost","达方物流")
        );
        response.setResult(resultList);
        log.info("查询物流公司返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 3.7 自有物流查询接口
    @PostMapping(value = "/sendOrderNo", headers = "token")
    public ResponseEntity<SelfLogisticsResponse> sendOrderNo(@RequestHeader("token")String token,@RequestBody SelfLogisticsRequest request) {
        log.info("自有物流查询接口请求报文：{},token:{}", JSON.toJSONString(request),token);
        SelfLogisticsResponse response = new SelfLogisticsResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<SelfLogisticsResponse.SelfLogisticsResult.OrderTrack> orderTrackList = Arrays.asList(
            new SelfLogisticsResponse.SelfLogisticsResult.OrderTrack("您的订单已确认","2020-11-02 10:47:01"),
              new SelfLogisticsResponse.SelfLogisticsResult.OrderTrack("您的订单已进入【**仓库】,正在配拣中.......","2020-11-02 11:24:23"),
               new SelfLogisticsResponse.SelfLogisticsResult.OrderTrack("包裹号 8001879058 已出库,正在配送中......","2020-11-02 11:24:23")
        );
        SelfLogisticsResponse.SelfLogisticsResult result = new SelfLogisticsResponse.SelfLogisticsResult("8001879058",orderTrackList);
        response.setResult(Arrays.asList(result));
        log.info("自有物流查询接口返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }


    // 4.1 查询结算单信息
    @PostMapping(value = "/queryBillInfo", headers = "token")
    public ResponseEntity<BillInfoResponse> queryBillInfo(@RequestHeader("token")String token,@RequestBody BillInfoRequest request) {
        log.info("查询结算单信息请求报文：{},token:{}", JSON.toJSONString(request),token);
        BillInfoResponse response = new BillInfoResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        BillInfoResponse.BillInfoResult result = new BillInfoResponse.BillInfoResult();
         result.setSettlementSn("VE-20230525131435203157");
         result.setSettlementPrice(new BigDecimal("400.00"));
         result.setWirteWaitPrice(new BigDecimal("800.00"));
        result.setWirteFinishPrice(new BigDecimal("400.00"));
         result.setDepartmentName("**");
        result.setFullDepartmentName("**");
         result.setSettlementStatus("6");
        result.setInvoicingTime("2023-05-25 13:27:00");
        result.setInvoiceTitle("tx公司");
         result.setTaxNo("SGhkjkjj97779h");
         result.setAddress("北京路支行");
         result.setBankName("工商银行");
         result.setBankAccount("20015421545");
         result.setTelephone("1300024521");
        result.setInvoiceAddressName("");
        result.setInvoiceAddressMobile("");
        result.setInvoiceAddressPostCode("");
        result.setInvoiceAddressAreaId("");
         result.setInvoiceAddressAreaName("");
         result.setInvoiceAddress("");

        List<BillInfoResponse.BillInfoResult.SettlementItemListResult> settlementItemList = Arrays.asList(
          new BillInfoResponse.BillInfoResult.SettlementItemListResult("PO-1376433565247471616-20230525131343139454","1",new BigDecimal("2000.00"))
        );
        List<BillInfoResponse.BillInfoResult.SettlemenInvoiceListResult> settlemenInvoiceList = Arrays.asList(
          new BillInfoResponse.BillInfoResult.SettlemenInvoiceListResult("2023-05-25 00:00:00","1","1","0","null",new BigDecimal("22.2"),null,"","null","","jd","京东","jd123565669","")
        );
        result.setSettlementItemList(settlementItemList);
        result.setSettlemenInvoiceList(settlemenInvoiceList);
        response.setResult(result);
        log.info("查询结算单信息返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 4.2 推送开票信息
    @PostMapping(value = "/sendInvoiceInfo", headers = "token")
    public ResponseEntity<BaseResponse> sendInvoiceInfo(@RequestHeader("token")String token,@RequestBody SendInvoiceRequest request) {
        log.info("推送开票信息请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("推送开票信息返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
     // 4.3 获取订单核销明细信息
    @PostMapping(value = "/queryOrderSourceDocumentInfo", headers = "token")
    public ResponseEntity<OrderSourceDocumentResponse> queryOrderSourceDocumentInfo(@RequestHeader("token")String token, @RequestBody OrderSourceDocumentRequest request) {
        log.info("获取订单核销明细信息请求报文：{},token:{}", JSON.toJSONString(request),token);
        OrderSourceDocumentResponse response = new OrderSourceDocumentResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
	    return ResponseEntity.ok(response);
    }
		
		
		 // 4.4 处理订单核销明细信息
    @PostMapping(value = "/sendOrderSourceDocumentStatus", headers = "token")
    public ResponseEntity<BaseResponse> sendOrderSourceDocumentStatus(@RequestHeader("token")String token, @RequestBody OrderSourceDocumentRequest request) {
         log.info("处理订单核销明细信息请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("处理订单核销明细信息返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 5.1 查询询价单详情
    @PostMapping(value = "/getInquiryStore", headers = "token")
    public ResponseEntity<InquiryStoreResponse> getInquiryStore(@RequestHeader("token")String token, @RequestBody(required = false) InquiryStoreRequest request) {
         log.info("查询询价单详情请求报文：{},token:{}", JSON.toJSONString(request),token);
         InquiryStoreResponse response = new InquiryStoreResponse();
         response.setSuccess(true);

		response.setResultCode("200");
        response.setResultMessage("操作成功");
        InquiryStoreResponse.InquiryStoreResult result = new InquiryStoreResponse.InquiryStoreResult();
        result.setInquirySn("XJ-20230618122357925527");
        result.setInquiryType("1");
        result.setInvoiceType("0");
        result.setUserName("张三");
        result.setTelePhone("13512345689");
        result.setCreateTime("2023-06-18 13:48:30");
        result.setDepartmentName("");
        result.setCloseTime("2023-06-22 23:59:59");
        result.setDeliveryTime("2023-06-29 23:59:59");
        result.setExpectPayTime("2023-06-29 23:59:59");
        result.setConsigneeName("");
        result.setConsigneeMobile("");
        result.setConsigneeAddressPath("");
        result.setConsigneeAddressIdPath("");
        result.setConsigneeDetail("");
        result.setStatus("5");
        result.setReason("");
        result.setStoreRemark(null);
         List<InquiryStoreResponse.InquiryStoreResult.GoodsDataResult> goodsDataResults = Arrays.asList(
                 new InquiryStoreResponse.InquiryStoreResult.GoodsDataResult()
         );
        result.setGoodsDataList(goodsDataResults);
        List<InquiryStoreResponse.InquiryStoreResult.InquiryStoreDataResult> inquiryStoreDataResults = Arrays.asList(
            new InquiryStoreResponse.InquiryStoreResult.InquiryStoreDataResult()
        );
        result.setInquiryStoreDataList(inquiryStoreDataResults);
        response.setResult(Arrays.asList(result));
        log.info("查询询价单详情返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }

    // 5.2 供应商提交商品报价
    @PostMapping(value = "/submitInquiryStore", headers = "token")
    public ResponseEntity<BaseResponse> submitInquiryStore(@RequestHeader("token")String token,@RequestBody SubmitInquiryStoreRequest request) {
       log.info("供应商提交商品报价请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("供应商提交商品报价返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 6.1 获取省级地址
    @PostMapping(value = "/allProvincesAddress", headers = "token")
    public ResponseEntity<AddressResponse> allProvincesAddress(@RequestHeader("token")String token) {
        log.info("获取省级地址请求报文：token:{}", token);
        AddressResponse response = new AddressResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
         List<AddressResponse.AddressResult> resultList = Arrays.asList(
            new AddressResponse.AddressResult("1","北京"),
                 new AddressResponse.AddressResult("2","上海"),
                new AddressResponse.AddressResult("31","新疆"),
                 new AddressResponse.AddressResult("43","澳门"),
                 new AddressResponse.AddressResult("52993","港澳"),
                  new AddressResponse.AddressResult("53283","海外")
         );
        response.setResult(resultList);
         log.info("获取省级地址返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
     // 6.2 根据省级地址查询子地址
    @PostMapping(value = "/citysByProvinceId", headers = "token")
    public ResponseEntity<CitysByProvinceIdResponse> citysByProvinceId(@RequestHeader("token")String token,@RequestBody CitysByProvinceIdRequest request) {
         log.info("根据省级地址查询子地址请求报文：{},token:{}", JSON.toJSONString(request),token);
        CitysByProvinceIdResponse response = new CitysByProvinceIdResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
         List<CitysByProvinceIdResponse.CitysByProvinceIdResult> resultList = Arrays.asList(
            new CitysByProvinceIdResponse.CitysByProvinceIdResult("2386","铜川市","27","1",Arrays.asList(
               new CitysByProvinceIdResponse.CitysByProvinceIdResult("2389","王益区","2386","2",Arrays.asList(
                       new CitysByProvinceIdResponse.CitysByProvinceIdResult("56650","桃园街道","2389","3",null),
                       new CitysByProvinceIdResponse.CitysByProvinceIdResult("56651","王家河街道","2389","3",null),
                       new CitysByProvinceIdResponse.CitysByProvinceIdResult("56647","红旗街街道","2389","3",null),
                       new CitysByProvinceIdResponse.CitysByProvinceIdResult("56648","七一路街道","2389","3",null),
                       new CitysByProvinceIdResponse.CitysByProvinceIdResult("56649","青年路街道","2389","3",null),
                       new CitysByProvinceIdResponse.CitysByProvinceIdResult("13156","黄堡镇","2389","3",null),
                       new CitysByProvinceIdResponse.CitysByProvinceIdResult("13157","王益街道","2389","3",null)

               ))
            ))
         );
        response.setResult(resultList);
        log.info("根据省级地址查询子地址返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 6.3 查询二级单位
    @PostMapping(value = "/getSecDepartment", headers = "token")
    public ResponseEntity<SecDepartmentResponse> getSecDepartment(@RequestHeader("token")String token) {
        log.info("查询二级单位请求报文：token:{}", token);
        SecDepartmentResponse response = new SecDepartmentResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<SecDepartmentResponse.SecDepartmentResult> resultList = Arrays.asList(
            new SecDepartmentResponse.SecDepartmentResult("1337588898931975734","中国****有限公司"),
                 new SecDepartmentResponse.SecDepartmentResult("1337589130592133392","山东****有限公司")
         );
        response.setResult(resultList);
        log.info("查询二级单位返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 7.1 查询推送消息
    @PostMapping(value = "/getProviderMessage", headers = "token")
        public ResponseEntity<ProviderMessageResponse> getProviderMessage(@RequestHeader("token")String token,@RequestBody ProviderMessageRequest request) {
       log.info("查询推送消息请求报文：{},token:{}", JSON.toJSONString(request),token);
        ProviderMessageResponse response = new ProviderMessageResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        List<ProviderMessageResponse.ProviderMessageResult> resultList = Arrays.asList(
            new ProviderMessageResponse.ProviderMessageResult("1756281274809495554",1,"2024-02-10 19:37:40","{\"stype\": 2,\"skuNo\": \"sku222\",\"time\": \"2024-02-10 19:37:34\",\"type\": 1}"),
                new ProviderMessageResponse.ProviderMessageResult("1756280017659158530",1,"2024-02-10 19:33:21","{\"stype\": 1, \"skuNo\": \"skulll\",\"time\": \"2024-02-10 19:32:37\",\"type\": 1}")
         );
         response.setResult(resultList);
        log.info("查询推送消息返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
    // 7.2 删除推送消息
    @PostMapping(value = "/delProviderMessage", headers = "token")
    public ResponseEntity<BaseResponse> delProviderMessage(@RequestHeader("token")String token,@RequestBody DelProviderMessageRequest request) {
         log.info("删除推送消息请求报文：{},token:{}", JSON.toJSONString(request),token);
        BaseResponse response = new BaseResponse();
        response.setSuccess(true);
        response.setResultCode("200");
        response.setResultMessage("操作成功");
        log.info("删除推送消息返回报文：{}", JSON.toJSONString(response));
        return ResponseEntity.ok(response);
    }
}