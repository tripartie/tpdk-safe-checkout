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
from tpdk_safe_checkout.models.offer_organization_collection_read import OfferOrganizationCollectionRead
from typing import Optional, Set
from typing_extensions import Self

class OfferCollectionRead(BaseModel):
    """
    
    """ # noqa: E501
    ulid: StrictStr
    status: StrictStr
    public_url: Optional[StrictStr] = Field(default=None, description="The public URL for your Ad/Offer on your marketplace.", alias="publicUrl")
    url: Optional[StrictStr]
    organization: Optional[OfferOrganizationCollectionRead] = None
    seller: StrictStr
    preset_buyer: Optional[StrictStr] = Field(default=None, description="Limit the offer to a particular buyer. Useful if the offer was issued from an auction for instance.", alias="presetBuyer")
    nature: Optional[StrictStr] = Field(default='physical_item', description="This WILL affect the assigned workflow. Choosing service will disable delivery for example. Refer to our technical hub for more information.")
    title: Optional[StrictStr] = None
    unit_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="unitPrice")
    min_negotiable_unit_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="minNegotiableUnitPrice")
    allow_to_negotiate_unit_price: Optional[StrictBool] = Field(default=None, alias="allowToNegotiateUnitPrice")
    currency_code: Optional[StrictStr] = Field(default='EUR', alias="currencyCode")
    item_count: Optional[StrictInt] = Field(default=1, alias="itemCount")
    condition: Optional[StrictStr] = 'USED'
    shipping_allowed: Optional[StrictBool] = Field(default=None, description="That toggle allows the seller to propose shipping for its item. If set in conjunction of shippingCarrier, the label will be automatically generated. Also, it will restrict the carrier to the limited subset defined.", alias="shippingAllowed")
    hand_delivery_allowed: Optional[StrictBool] = Field(default=True, description="Enable both parties to finalize the transaction in person rather than using delivery. A QR Code must be scanned by the seller once the buyer claims the product.", alias="handDeliveryAllowed")
    shipping_carriers: Optional[List[StrictStr]] = Field(default=None, description="If you wish to enable automated shipping label generation through a specific provider, specify it there.", alias="shippingCarriers")
    created_at: Optional[datetime] = Field(default=None, alias="createdAt")
    updated_at: Optional[datetime] = Field(default=None, alias="updatedAt")
    iri: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["ulid", "status", "publicUrl", "url", "organization", "seller", "presetBuyer", "nature", "title", "unitPrice", "minNegotiableUnitPrice", "allowToNegotiateUnitPrice", "currencyCode", "itemCount", "condition", "shippingAllowed", "handDeliveryAllowed", "shippingCarriers", "createdAt", "updatedAt", "iri"]

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
        """Create an instance of OfferCollectionRead from a JSON string"""
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
        """
        excluded_fields: Set[str] = set([
            "url",
            "created_at",
            "updated_at",
            "iri",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of organization
        if self.organization:
            _dict['organization'] = self.organization.to_dict()
        # set to None if public_url (nullable) is None
        # and model_fields_set contains the field
        if self.public_url is None and "public_url" in self.model_fields_set:
            _dict['publicUrl'] = None

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

        # set to None if updated_at (nullable) is None
        # and model_fields_set contains the field
        if self.updated_at is None and "updated_at" in self.model_fields_set:
            _dict['updatedAt'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of OfferCollectionRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ulid": obj.get("ulid"),
            "status": obj.get("status"),
            "publicUrl": obj.get("publicUrl"),
            "url": obj.get("url"),
            "organization": OfferOrganizationCollectionRead.from_dict(obj["organization"]) if obj.get("organization") is not None else None,
            "seller": obj.get("seller"),
            "presetBuyer": obj.get("presetBuyer"),
            "nature": obj.get("nature") if obj.get("nature") is not None else 'physical_item',
            "title": obj.get("title"),
            "unitPrice": obj.get("unitPrice"),
            "minNegotiableUnitPrice": obj.get("minNegotiableUnitPrice"),
            "allowToNegotiateUnitPrice": obj.get("allowToNegotiateUnitPrice"),
            "currencyCode": obj.get("currencyCode") if obj.get("currencyCode") is not None else 'EUR',
            "itemCount": obj.get("itemCount") if obj.get("itemCount") is not None else 1,
            "condition": obj.get("condition") if obj.get("condition") is not None else 'USED',
            "shippingAllowed": obj.get("shippingAllowed"),
            "handDeliveryAllowed": obj.get("handDeliveryAllowed") if obj.get("handDeliveryAllowed") is not None else True,
            "shippingCarriers": obj.get("shippingCarriers"),
            "createdAt": obj.get("createdAt"),
            "updatedAt": obj.get("updatedAt"),
            "iri": obj.get("iri")
        })
        return _obj


