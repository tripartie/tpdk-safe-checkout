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
from typing import Optional, Set
from typing_extensions import Self

class QuoteRead(BaseModel):
    """
    Someone has to ask for a Quote prior to create a transaction and (therefor) charging a known amount of money.
    """ # noqa: E501
    ulid: StrictStr
    shipping_carrier: StrictStr = Field(alias="shippingCarrier")
    quantity_to_be_acquired: StrictInt = Field(alias="quantityToBeAcquired")
    attempt_unit_price: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="attemptUnitPrice")
    transaction_fees: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="transactionFees")
    shipping_fees: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="shippingFees")
    created_at: datetime = Field(alias="createdAt")
    expire_at: datetime = Field(alias="expireAt")
    iri: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["ulid", "shippingCarrier", "quantityToBeAcquired", "attemptUnitPrice", "transactionFees", "shippingFees", "createdAt", "expireAt", "iri"]

    @field_validator('shipping_carrier')
    def shipping_carrier_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['SwissPost', 'Colissimo', 'MondialRelay']):
            raise ValueError("must be one of enum values ('SwissPost', 'Colissimo', 'MondialRelay')")
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
        """Create an instance of QuoteRead from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "iri",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of QuoteRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ulid": obj.get("ulid"),
            "shippingCarrier": obj.get("shippingCarrier"),
            "quantityToBeAcquired": obj.get("quantityToBeAcquired") if obj.get("quantityToBeAcquired") is not None else 1,
            "attemptUnitPrice": obj.get("attemptUnitPrice"),
            "transactionFees": obj.get("transactionFees"),
            "shippingFees": obj.get("shippingFees"),
            "createdAt": obj.get("createdAt"),
            "expireAt": obj.get("expireAt"),
            "iri": obj.get("iri")
        })
        return _obj


