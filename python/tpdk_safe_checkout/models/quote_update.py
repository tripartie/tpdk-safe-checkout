# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.69
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from typing_extensions import Annotated
from tpdk_safe_checkout.models.quote_address_update import QuoteAddressUpdate
from typing import Optional, Set
from typing_extensions import Self

class QuoteUpdate(BaseModel):
    """
    Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.
    """ # noqa: E501
    shipping_carrier: Optional[StrictStr] = Field(default=None, alias="shippingCarrier")
    pickup_code: Optional[StrictStr] = Field(default=None, alias="pickupCode")
    quantity_to_be_acquired: Optional[StrictInt] = Field(default=1, alias="quantityToBeAcquired")
    attempt_unit_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="attemptUnitPrice")
    third_party_recipient_first_name: Optional[Annotated[str, Field(min_length=1, strict=True, max_length=32)]] = Field(default=None, alias="thirdPartyRecipientFirstName")
    third_party_recipient_last_name: Optional[Annotated[str, Field(min_length=1, strict=True, max_length=32)]] = Field(default=None, alias="thirdPartyRecipientLastName")
    third_party_recipient_address: Optional[QuoteAddressUpdate] = Field(default=None, alias="thirdPartyRecipientAddress")
    __properties: ClassVar[List[str]] = ["shippingCarrier", "pickupCode", "quantityToBeAcquired", "attemptUnitPrice", "thirdPartyRecipientFirstName", "thirdPartyRecipientLastName", "thirdPartyRecipientAddress"]

    @field_validator('shipping_carrier')
    def shipping_carrier_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['SwissPost', 'Colissimo', 'MondialRelay', 'null']):
            raise ValueError("must be one of enum values ('SwissPost', 'Colissimo', 'MondialRelay', 'null')")
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
        """Create an instance of QuoteUpdate from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of third_party_recipient_address
        if self.third_party_recipient_address:
            _dict['thirdPartyRecipientAddress'] = self.third_party_recipient_address.to_dict()
        # set to None if shipping_carrier (nullable) is None
        # and model_fields_set contains the field
        if self.shipping_carrier is None and "shipping_carrier" in self.model_fields_set:
            _dict['shippingCarrier'] = None

        # set to None if pickup_code (nullable) is None
        # and model_fields_set contains the field
        if self.pickup_code is None and "pickup_code" in self.model_fields_set:
            _dict['pickupCode'] = None

        # set to None if third_party_recipient_first_name (nullable) is None
        # and model_fields_set contains the field
        if self.third_party_recipient_first_name is None and "third_party_recipient_first_name" in self.model_fields_set:
            _dict['thirdPartyRecipientFirstName'] = None

        # set to None if third_party_recipient_last_name (nullable) is None
        # and model_fields_set contains the field
        if self.third_party_recipient_last_name is None and "third_party_recipient_last_name" in self.model_fields_set:
            _dict['thirdPartyRecipientLastName'] = None

        # set to None if third_party_recipient_address (nullable) is None
        # and model_fields_set contains the field
        if self.third_party_recipient_address is None and "third_party_recipient_address" in self.model_fields_set:
            _dict['thirdPartyRecipientAddress'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of QuoteUpdate from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "shippingCarrier": obj.get("shippingCarrier"),
            "pickupCode": obj.get("pickupCode"),
            "quantityToBeAcquired": obj.get("quantityToBeAcquired") if obj.get("quantityToBeAcquired") is not None else 1,
            "attemptUnitPrice": obj.get("attemptUnitPrice"),
            "thirdPartyRecipientFirstName": obj.get("thirdPartyRecipientFirstName"),
            "thirdPartyRecipientLastName": obj.get("thirdPartyRecipientLastName"),
            "thirdPartyRecipientAddress": QuoteAddressUpdate.from_dict(obj["thirdPartyRecipientAddress"]) if obj.get("thirdPartyRecipientAddress") is not None else None
        })
        return _obj


