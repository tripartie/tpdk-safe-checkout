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

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Union
from typing import Optional, Set
from typing_extensions import Self

class StatisticOutputSingleValue(BaseModel):
    """
    StatisticOutputSingleValue
    """ # noqa: E501
    request: StrictStr
    start_at: datetime = Field(alias="startAt")
    end_at: datetime = Field(alias="endAt")
    value: Union[StrictFloat, StrictInt]
    __properties: ClassVar[List[str]] = ["request", "startAt", "endAt", "value"]

    @field_validator('request')
    def request_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['OFFER_PUBLISHED_AMOUNT', 'OFFER_PUBLISHED_COUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_COUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE', 'TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE', 'TRANSACTION_COMPLETED_AMOUNT', 'TRANSACTION_COMPLETED_COUNT', 'TRANSACTION_COMPLETED_SERVICE_FEE', 'TRANSACTION_COMPLETED_SHIPPING_FEE', 'TRANSACTION_CREATED_AMOUNT', 'TRANSACTION_CREATED_COUNT', 'WALLET_AVAILABLE_AMOUNT', 'WALLET_IN_CUSTODY_AMOUNT']):
            raise ValueError("must be one of enum values ('OFFER_PUBLISHED_AMOUNT', 'OFFER_PUBLISHED_COUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_COUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE', 'TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE', 'TRANSACTION_COMPLETED_AMOUNT', 'TRANSACTION_COMPLETED_COUNT', 'TRANSACTION_COMPLETED_SERVICE_FEE', 'TRANSACTION_COMPLETED_SHIPPING_FEE', 'TRANSACTION_CREATED_AMOUNT', 'TRANSACTION_CREATED_COUNT', 'WALLET_AVAILABLE_AMOUNT', 'WALLET_IN_CUSTODY_AMOUNT')")
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
        """Create an instance of StatisticOutputSingleValue from a JSON string"""
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
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of StatisticOutputSingleValue from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "request": obj.get("request"),
            "startAt": obj.get("startAt"),
            "endAt": obj.get("endAt"),
            "value": obj.get("value")
        })
        return _obj


