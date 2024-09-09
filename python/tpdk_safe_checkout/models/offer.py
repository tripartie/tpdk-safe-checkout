# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.60
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from tpdk_safe_checkout.models.metadata import Metadata
from tpdk_safe_checkout.models.view import View
from typing import Optional, Set
from typing_extensions import Self

class Offer(BaseModel):
    """
    
    """ # noqa: E501
    id: Optional[StrictInt] = None
    ulid: StrictStr
    status: StrictStr
    captcha: Optional[StrictStr] = None
    public_url: Optional[StrictStr] = Field(default=None, description="The public URL for your Ad/Offer on your marketplace.", alias="publicUrl")
    redirect_url: Optional[StrictStr] = Field(default=None, description="Fill-in that field IF you intend to redirect your customer instead of using a WebView.", alias="redirectUrl")
    url: Optional[StrictStr]
    organization: Optional[StrictStr] = None
    seller: StrictStr
    preset_buyer: Optional[StrictStr] = Field(default=None, description="Limit the offer to a particular buyer. Useful if the offer was issued from an auction for instance.", alias="presetBuyer")
    nature: Optional[StrictStr] = Field(default='physical_item', description="This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information.")
    title: Optional[StrictStr] = None
    description: Optional[StrictStr] = None
    unit_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="unitPrice")
    min_negotiable_unit_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="minNegotiableUnitPrice")
    allow_to_negotiate_unit_price: Optional[StrictBool] = Field(default=None, alias="allowToNegotiateUnitPrice")
    currency_code: Optional[StrictStr] = Field(default='EUR', alias="currencyCode")
    item_count: Optional[StrictInt] = Field(default=1, alias="itemCount")
    condition: Optional[StrictStr] = 'USED'
    weight_in_gram: Optional[StrictInt] = Field(default=None, description="Accepted values between 500g (0.5kg) and 10,000g (10kg).", alias="weightInGram")
    shipping_allowed: Optional[StrictBool] = Field(default=None, description="That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined.", alias="shippingAllowed")
    hand_delivery_allowed: Optional[StrictBool] = Field(default=True, description="Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product.", alias="handDeliveryAllowed")
    shipping_carriers: Optional[List[StrictStr]] = Field(default=None, description="If you wish to enable automated shipping label generation through a specific provider, specify it there.", alias="shippingCarriers")
    ean_code: Optional[StrictStr] = Field(default=None, alias="eanCode")
    can_be_sold_separately: Optional[StrictBool] = Field(default=True, description="Set this flag to false to forbid a potential buyer to acquire less than \"itemCount\" item(s)", alias="canBeSoldSeparately")
    metadata: Optional[List[Metadata]] = None
    medias: List[StrictStr]
    views: List[View]
    transactions: Optional[List[StrictStr]] = None
    quotes: Optional[List[StrictStr]] = None
    created_at: Optional[datetime] = Field(default=None, alias="createdAt")
    updated_at: Optional[datetime] = Field(default=None, alias="updatedAt")
    preset_buyer_id: Optional[StrictInt] = Field(default=None, alias="presetBuyerId")
    seller_id: Optional[StrictInt] = Field(default=None, alias="sellerId")
    iri: Optional[StrictStr] = None
    half_price_point: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="halfPricePoint")
    __properties: ClassVar[List[str]] = ["id", "ulid", "status", "captcha", "publicUrl", "redirectUrl", "url", "organization", "seller", "presetBuyer", "nature", "title", "description", "unitPrice", "minNegotiableUnitPrice", "allowToNegotiateUnitPrice", "currencyCode", "itemCount", "condition", "weightInGram", "shippingAllowed", "handDeliveryAllowed", "shippingCarriers", "eanCode", "canBeSoldSeparately", "metadata", "medias", "views", "transactions", "quotes", "createdAt", "updatedAt", "presetBuyerId", "sellerId", "iri", "halfPricePoint"]

    @field_validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['issued', 'active', 'fulfilled', 'expired']):
            raise ValueError("must be one of enum values ('issued', 'active', 'fulfilled', 'expired')")
        return value

    @field_validator('nature')
    def nature_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['service', 'physical_item', 'dematerialized_item', 'rent_item']):
            raise ValueError("must be one of enum values ('service', 'physical_item', 'dematerialized_item', 'rent_item')")
        return value

    @field_validator('condition')
    def condition_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['NEW', 'USED', 'DAMAGED', 'DETERIORATED', 'UNRECOVERABLE']):
            raise ValueError("must be one of enum values ('NEW', 'USED', 'DAMAGED', 'DETERIORATED', 'UNRECOVERABLE')")
        return value

    @field_validator('shipping_carriers')
    def shipping_carriers_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        for i in value:
            if i not in set(['SwissPost', 'Colissimo', 'MondialRelay']):
                raise ValueError("each list item must be one of ('SwissPost', 'Colissimo', 'MondialRelay')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of Offer from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "id",
            "url",
            "created_at",
            "updated_at",
            "preset_buyer_id",
            "seller_id",
            "iri",
            "half_price_point",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of each item in metadata (list)
        _items = []
        if self.metadata:
            for _item_metadata in self.metadata:
                if _item_metadata:
                    _items.append(_item_metadata.to_dict())
            _dict['metadata'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in views (list)
        _items = []
        if self.views:
            for _item_views in self.views:
                if _item_views:
                    _items.append(_item_views.to_dict())
            _dict['views'] = _items
        # set to None if captcha (nullable) is None
        # and model_fields_set contains the field
        if self.captcha is None and "captcha" in self.model_fields_set:
            _dict['captcha'] = None

        # set to None if public_url (nullable) is None
        # and model_fields_set contains the field
        if self.public_url is None and "public_url" in self.model_fields_set:
            _dict['publicUrl'] = None

        # set to None if redirect_url (nullable) is None
        # and model_fields_set contains the field
        if self.redirect_url is None and "redirect_url" in self.model_fields_set:
            _dict['redirectUrl'] = None

        # set to None if url (nullable) is None
        # and model_fields_set contains the field
        if self.url is None and "url" in self.model_fields_set:
            _dict['url'] = None

        # set to None if organization (nullable) is None
        # and model_fields_set contains the field
        if self.organization is None and "organization" in self.model_fields_set:
            _dict['organization'] = None

        # set to None if preset_buyer (nullable) is None
        # and model_fields_set contains the field
        if self.preset_buyer is None and "preset_buyer" in self.model_fields_set:
            _dict['presetBuyer'] = None

        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['description'] = None

        # set to None if ean_code (nullable) is None
        # and model_fields_set contains the field
        if self.ean_code is None and "ean_code" in self.model_fields_set:
            _dict['eanCode'] = None

        # set to None if updated_at (nullable) is None
        # and model_fields_set contains the field
        if self.updated_at is None and "updated_at" in self.model_fields_set:
            _dict['updatedAt'] = None

        # set to None if preset_buyer_id (nullable) is None
        # and model_fields_set contains the field
        if self.preset_buyer_id is None and "preset_buyer_id" in self.model_fields_set:
            _dict['presetBuyerId'] = None

        # set to None if seller_id (nullable) is None
        # and model_fields_set contains the field
        if self.seller_id is None and "seller_id" in self.model_fields_set:
            _dict['sellerId'] = None

        # set to None if half_price_point (nullable) is None
        # and model_fields_set contains the field
        if self.half_price_point is None and "half_price_point" in self.model_fields_set:
            _dict['halfPricePoint'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Offer from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "ulid": obj.get("ulid"),
            "status": obj.get("status"),
            "captcha": obj.get("captcha"),
            "publicUrl": obj.get("publicUrl"),
            "redirectUrl": obj.get("redirectUrl"),
            "url": obj.get("url"),
            "organization": obj.get("organization"),
            "seller": obj.get("seller"),
            "presetBuyer": obj.get("presetBuyer"),
            "nature": obj.get("nature") if obj.get("nature") is not None else 'physical_item',
            "title": obj.get("title"),
            "description": obj.get("description"),
            "unitPrice": obj.get("unitPrice"),
            "minNegotiableUnitPrice": obj.get("minNegotiableUnitPrice"),
            "allowToNegotiateUnitPrice": obj.get("allowToNegotiateUnitPrice"),
            "currencyCode": obj.get("currencyCode") if obj.get("currencyCode") is not None else 'EUR',
            "itemCount": obj.get("itemCount") if obj.get("itemCount") is not None else 1,
            "condition": obj.get("condition") if obj.get("condition") is not None else 'USED',
            "weightInGram": obj.get("weightInGram"),
            "shippingAllowed": obj.get("shippingAllowed"),
            "handDeliveryAllowed": obj.get("handDeliveryAllowed") if obj.get("handDeliveryAllowed") is not None else True,
            "shippingCarriers": obj.get("shippingCarriers"),
            "eanCode": obj.get("eanCode"),
            "canBeSoldSeparately": obj.get("canBeSoldSeparately") if obj.get("canBeSoldSeparately") is not None else True,
            "metadata": [Metadata.from_dict(_item) for _item in obj["metadata"]] if obj.get("metadata") is not None else None,
            "medias": obj.get("medias"),
            "views": [View.from_dict(_item) for _item in obj["views"]] if obj.get("views") is not None else None,
            "transactions": obj.get("transactions"),
            "quotes": obj.get("quotes"),
            "createdAt": obj.get("createdAt"),
            "updatedAt": obj.get("updatedAt"),
            "presetBuyerId": obj.get("presetBuyerId"),
            "sellerId": obj.get("sellerId"),
            "iri": obj.get("iri"),
            "halfPricePoint": obj.get("halfPricePoint")
        })
        return _obj


