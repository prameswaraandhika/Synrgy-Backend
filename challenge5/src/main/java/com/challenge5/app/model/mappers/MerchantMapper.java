package com.challenge5.app.model.mappers;

import com.challenge5.app.model.Merchant;
import com.challenge5.app.model.dtos.MerchanDto;
import org.mapstruct.Mapper;

@Mapper
public interface MerchantMapper {
    Merchant merchantDtoToMerchant(MerchanDto merchanDto);

    MerchanDto merchantToMerchantDto(Merchant merchant);
}
