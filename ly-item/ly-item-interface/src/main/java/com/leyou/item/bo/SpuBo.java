package com.leyou.item.bo;

import com.leyou.item.pojo.Sku;
import com.leyou.item.pojo.Spu;
import com.leyou.item.pojo.SpuDetail;
import lombok.Data;

import java.util.List;

@Data
public class SpuBo extends Spu {



    private String cname;//商品分类名称


    private String bname;//品牌名称


    public List<Sku>  skus;

    public SpuDetail spuDetail;





    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public List<Sku> getSkus() {
        return skus;
    }

    public void setSkus(List<Sku> skus) {
        this.skus = skus;
    }





    public SpuDetail getSpuDtail() {
        return spuDetail;
    }

    public void setSpuDetail(SpuDetail spuDetail) {

        this.spuDetail = spuDetail;
    }
}

