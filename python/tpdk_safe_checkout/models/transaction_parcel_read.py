# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.113
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self

class TransactionParcelRead(BaseModel):
    """
    
    """ # noqa: E501
    carrier: StrictStr
    identifier: Annotated[str, Field(min_length=4, strict=True, max_length=128)]
    price: Optional[Union[Annotated[float, Field(strict=True, ge=0)], Annotated[int, Field(strict=True, ge=0)]]] = None
    currency: Optional[StrictStr] = 'EUR'
    status: Optional[StrictStr] = None
    label_public_url: Optional[StrictStr] = Field(default=None, alias="labelPublicUrl")
    tracking_public_url: Optional[StrictStr] = Field(default=None, alias="trackingPublicUrl")
    historical_recipient_address: Optional[StrictStr] = Field(default=None, alias="historicalRecipientAddress")
    historical_sender_address: Optional[StrictStr] = Field(default=None, alias="historicalSenderAddress")
    created_at: Optional[datetime] = Field(default=None, alias="createdAt")
    updated_at: Optional[datetime] = Field(default=None, alias="updatedAt")
    __properties: ClassVar[List[str]] = ["carrier", "identifier", "price", "currency", "status", "labelPublicUrl", "trackingPublicUrl", "historicalRecipientAddress", "historicalSenderAddress", "createdAt", "updatedAt"]

    @field_validator('carrier')
    def carrier_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['SwissPost', 'Colissimo', 'MondialRelay']):
            raise ValueError("must be one of enum values ('SwissPost', 'Colissimo', 'MondialRelay')")
        return value

    @field_validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['CREATED', 'SHIPPED', 'IN_TRANSIT', 'DELIVERED', 'ERROR', 'ACCEPTED', 'REFUSED']):
            raise ValueError("must be one of enum values ('CREATED', 'SHIPPED', 'IN_TRANSIT', 'DELIVERED', 'ERROR', 'ACCEPTED', 'REFUSED')")
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
        """Create an instance of TransactionParcelRead from a JSON string"""
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
        """
        excluded_fields: Set[str] = set([
            "created_at",
            "updated_at",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # set to None if price (nullable) is None
        # and model_fields_set contains the field
        if self.price is None and "price" in self.model_fields_set:
            _dict['price'] = None

        # set to None if currency (nullable) is None
        # and model_fields_set contains the field
        if self.currency is None and "currency" in self.model_fields_set:
            _dict['currency'] = None

        # set to None if status (nullable) is None
        # and model_fields_set contains the field
        if self.status is None and "status" in self.model_fields_set:
            _dict['status'] = None

        # set to None if label_public_url (nullable) is None
        # and model_fields_set contains the field
        if self.label_public_url is None and "label_public_url" in self.model_fields_set:
            _dict['labelPublicUrl'] = None

        # set to None if tracking_public_url (nullable) is None
        # and model_fields_set contains the field
        if self.tracking_public_url is None and "tracking_public_url" in self.model_fields_set:
            _dict['trackingPublicUrl'] = None

        # set to None if historical_recipient_address (nullable) is None
        # and model_fields_set contains the field
        if self.historical_recipient_address is None and "historical_recipient_address" in self.model_fields_set:
            _dict['historicalRecipientAddress'] = None

        # set to None if historical_sender_address (nullable) is None
        # and model_fields_set contains the field
        if self.historical_sender_address is None and "historical_sender_address" in self.model_fields_set:
            _dict['historicalSenderAddress'] = None

        # set to None if updated_at (nullable) is None
        # and model_fields_set contains the field
        if self.updated_at is None and "updated_at" in self.model_fields_set:
            _dict['updatedAt'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TransactionParcelRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "carrier": obj.get("carrier"),
            "identifier": obj.get("identifier"),
            "price": obj.get("price"),
            "currency": obj.get("currency") if obj.get("currency") is not None else 'EUR',
            "status": obj.get("status"),
            "labelPublicUrl": obj.get("labelPublicUrl"),
            "trackingPublicUrl": obj.get("trackingPublicUrl"),
            "historicalRecipientAddress": obj.get("historicalRecipientAddress"),
            "historicalSenderAddress": obj.get("historicalSenderAddress"),
            "createdAt": obj.get("createdAt"),
            "updatedAt": obj.get("updatedAt")
        })
        return _obj


