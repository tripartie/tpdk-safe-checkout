# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.23
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from tpdk_safe_checkout.models.transaction_offer_collection_read import TransactionOfferCollectionRead
from tpdk_safe_checkout.models.transaction_persona_collection_read import TransactionPersonaCollectionRead
from tpdk_safe_checkout.models.transaction_quote_collection_read import TransactionQuoteCollectionRead
from typing import Optional, Set
from typing_extensions import Self

class TransactionCollectionRead(BaseModel):
    """
    
    """ # noqa: E501
    ulid: StrictStr
    offer: TransactionOfferCollectionRead
    quote: TransactionQuoteCollectionRead
    buyer: TransactionPersonaCollectionRead
    status: Optional[StrictStr] = None
    fees: Optional[Union[StrictFloat, StrictInt]] = None
    supplemental_fees: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="supplementalFees")
    provider_name: Optional[StrictStr] = Field(default=None, alias="providerName")
    provider_created_at: Optional[datetime] = Field(default=None, alias="providerCreatedAt")
    provider_updated_at: Optional[datetime] = Field(default=None, alias="providerUpdatedAt")
    total: Optional[Union[StrictFloat, StrictInt]] = None
    total_charged: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="totalCharged")
    total_fees: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="totalFees")
    awaited_party: Optional[StrictStr] = Field(default=None, description="Determine who is awaited (actor) for the next transition", alias="awaitedParty")
    status_expiration: Optional[datetime] = Field(default=None, description="Yield if eligible the date-time at which the transaction state expire.", alias="statusExpiration")
    processor_status: Optional[StrictStr] = Field(default=None, description="Automagically infer on what state the entity is at the Payment Processor.", alias="processorStatus")
    __properties: ClassVar[List[str]] = ["ulid", "offer", "quote", "buyer", "status", "fees", "supplementalFees", "providerName", "providerCreatedAt", "providerUpdatedAt", "total", "totalCharged", "totalFees", "awaitedParty", "statusExpiration", "processorStatus"]

    @field_validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['CREATED', 'AUTHORIZED', 'REFUSED', 'ACCEPTED', 'SHIPPED', 'IN_TRANSIT', 'BLOCKED', 'DELIVERED', 'COMPLETED', 'DISPUTED', 'CANCELLED', 'null']):
            raise ValueError("must be one of enum values ('CREATED', 'AUTHORIZED', 'REFUSED', 'ACCEPTED', 'SHIPPED', 'IN_TRANSIT', 'BLOCKED', 'DELIVERED', 'COMPLETED', 'DISPUTED', 'CANCELLED', 'null')")
        return value

    @field_validator('awaited_party')
    def awaited_party_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['BUYER', 'PLATFORM', 'SELLER']):
            raise ValueError("must be one of enum values ('BUYER', 'PLATFORM', 'SELLER')")
        return value

    @field_validator('processor_status')
    def processor_status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['unallocated', 'allocating', 'allocated', 'freed', 'outdated']):
            raise ValueError("must be one of enum values ('unallocated', 'allocating', 'allocated', 'freed', 'outdated')")
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
        """Create an instance of TransactionCollectionRead from a JSON string"""
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
            "provider_created_at",
            "provider_updated_at",
            "total",
            "total_charged",
            "total_fees",
            "awaited_party",
            "status_expiration",
            "processor_status",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of offer
        if self.offer:
            _dict['offer'] = self.offer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of quote
        if self.quote:
            _dict['quote'] = self.quote.to_dict()
        # override the default output from pydantic by calling `to_dict()` of buyer
        if self.buyer:
            _dict['buyer'] = self.buyer.to_dict()
        # set to None if status (nullable) is None
        # and model_fields_set contains the field
        if self.status is None and "status" in self.model_fields_set:
            _dict['status'] = None

        # set to None if fees (nullable) is None
        # and model_fields_set contains the field
        if self.fees is None and "fees" in self.model_fields_set:
            _dict['fees'] = None

        # set to None if supplemental_fees (nullable) is None
        # and model_fields_set contains the field
        if self.supplemental_fees is None and "supplemental_fees" in self.model_fields_set:
            _dict['supplementalFees'] = None

        # set to None if provider_name (nullable) is None
        # and model_fields_set contains the field
        if self.provider_name is None and "provider_name" in self.model_fields_set:
            _dict['providerName'] = None

        # set to None if provider_created_at (nullable) is None
        # and model_fields_set contains the field
        if self.provider_created_at is None and "provider_created_at" in self.model_fields_set:
            _dict['providerCreatedAt'] = None

        # set to None if provider_updated_at (nullable) is None
        # and model_fields_set contains the field
        if self.provider_updated_at is None and "provider_updated_at" in self.model_fields_set:
            _dict['providerUpdatedAt'] = None

        # set to None if status_expiration (nullable) is None
        # and model_fields_set contains the field
        if self.status_expiration is None and "status_expiration" in self.model_fields_set:
            _dict['statusExpiration'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TransactionCollectionRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ulid": obj.get("ulid"),
            "offer": TransactionOfferCollectionRead.from_dict(obj["offer"]) if obj.get("offer") is not None else None,
            "quote": TransactionQuoteCollectionRead.from_dict(obj["quote"]) if obj.get("quote") is not None else None,
            "buyer": TransactionPersonaCollectionRead.from_dict(obj["buyer"]) if obj.get("buyer") is not None else None,
            "status": obj.get("status"),
            "fees": obj.get("fees"),
            "supplementalFees": obj.get("supplementalFees"),
            "providerName": obj.get("providerName"),
            "providerCreatedAt": obj.get("providerCreatedAt"),
            "providerUpdatedAt": obj.get("providerUpdatedAt"),
            "total": obj.get("total"),
            "totalCharged": obj.get("totalCharged"),
            "totalFees": obj.get("totalFees"),
            "awaitedParty": obj.get("awaitedParty"),
            "statusExpiration": obj.get("statusExpiration"),
            "processorStatus": obj.get("processorStatus")
        })
        return _obj

