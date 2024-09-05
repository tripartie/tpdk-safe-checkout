# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.38
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from tpdk_safe_checkout.models.offer_metadata_update import OfferMetadataUpdate
from typing import Optional, Set
from typing_extensions import Self

class OfferUpdate(BaseModel):
    """
    
    """ # noqa: E501
    public_url: Optional[StrictStr] = Field(default=None, description="The public URL for your Ad/Offer on your marketplace.", alias="publicUrl")
    redirect_url: Optional[StrictStr] = Field(default=None, description="Fill-in that field IF you intend to redirect your customer instead of using a WebView.", alias="redirectUrl")
    title: Optional[StrictStr] = None
    description: Optional[StrictStr] = None
    unit_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="unitPrice")
    min_negotiable_unit_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="minNegotiableUnitPrice")
    allow_to_negotiate_unit_price: Optional[StrictBool] = Field(default=None, alias="allowToNegotiateUnitPrice")
    currency_code: Optional[StrictStr] = Field(default='EUR', alias="currencyCode")
    shipping_allowed: Optional[StrictBool] = Field(default=None, description="That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined.", alias="shippingAllowed")
    hand_delivery_allowed: Optional[StrictBool] = Field(default=True, description="Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product.", alias="handDeliveryAllowed")
    shipping_carriers: Optional[List[StrictStr]] = Field(default=None, description="If you wish to enable automated shipping label generation through a specific provider, specify it there.", alias="shippingCarriers")
    ean_code: Optional[StrictStr] = Field(default=None, alias="eanCode")
    can_be_sold_separately: Optional[StrictBool] = Field(default=True, description="Set this flag to false to forbid a potential buyer to acquire less than \"itemCount\" item(s)", alias="canBeSoldSeparately")
    metadata: Optional[List[OfferMetadataUpdate]] = None
    __properties: ClassVar[List[str]] = ["publicUrl", "redirectUrl", "title", "description", "unitPrice", "minNegotiableUnitPrice", "allowToNegotiateUnitPrice", "currencyCode", "shippingAllowed", "handDeliveryAllowed", "shippingCarriers", "eanCode", "canBeSoldSeparately", "metadata"]

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
        """Create an instance of OfferUpdate from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
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
        # set to None if public_url (nullable) is None
        # and model_fields_set contains the field
        if self.public_url is None and "public_url" in self.model_fields_set:
            _dict['publicUrl'] = None

        # set to None if redirect_url (nullable) is None
        # and model_fields_set contains the field
        if self.redirect_url is None and "redirect_url" in self.model_fields_set:
            _dict['redirectUrl'] = None

        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['description'] = None

        # set to None if ean_code (nullable) is None
        # and model_fields_set contains the field
        if self.ean_code is None and "ean_code" in self.model_fields_set:
            _dict['eanCode'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of OfferUpdate from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "publicUrl": obj.get("publicUrl"),
            "redirectUrl": obj.get("redirectUrl"),
            "title": obj.get("title"),
            "description": obj.get("description"),
            "unitPrice": obj.get("unitPrice"),
            "minNegotiableUnitPrice": obj.get("minNegotiableUnitPrice"),
            "allowToNegotiateUnitPrice": obj.get("allowToNegotiateUnitPrice"),
            "currencyCode": obj.get("currencyCode") if obj.get("currencyCode") is not None else 'EUR',
            "shippingAllowed": obj.get("shippingAllowed"),
            "handDeliveryAllowed": obj.get("handDeliveryAllowed") if obj.get("handDeliveryAllowed") is not None else True,
            "shippingCarriers": obj.get("shippingCarriers"),
            "eanCode": obj.get("eanCode"),
            "canBeSoldSeparately": obj.get("canBeSoldSeparately") if obj.get("canBeSoldSeparately") is not None else True,
            "metadata": [OfferMetadataUpdate.from_dict(_item) for _item in obj["metadata"]] if obj.get("metadata") is not None else None
        })
        return _obj


