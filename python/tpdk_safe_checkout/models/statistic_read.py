# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.67
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
from typing import Any, ClassVar, Dict, List, Optional
from tpdk_safe_checkout.models.statistic_read_data_inner import StatisticReadDataInner
from typing import Optional, Set
from typing_extensions import Self

class StatisticRead(BaseModel):
    """
    StatisticRead
    """ # noqa: E501
    request: List[StrictStr]
    focus_on: Optional[StrictStr] = Field(default=None, alias="focusOn")
    focus_type: Optional[StrictStr] = Field(default=None, alias="focusType")
    start_at: Optional[datetime] = Field(default=None, alias="startAt")
    end_at: Optional[datetime] = Field(default=None, alias="endAt")
    group_by_period: Optional[StrictStr] = Field(default=None, alias="groupByPeriod")
    data: Optional[List[StatisticReadDataInner]] = None
    __properties: ClassVar[List[str]] = ["request", "focusOn", "focusType", "startAt", "endAt", "groupByPeriod", "data"]

    @field_validator('request')
    def request_validate_enum(cls, value):
        """Validates the enum"""
        for i in value:
            if i not in set(['OFFER_PUBLISHED_AMOUNT', 'OFFER_CREATED_AMOUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_COUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE', 'TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE', 'TRANSACTION_COMPLETED_AMOUNT', 'TRANSACTION_COMPLETED_COUNT', 'TRANSACTION_COMPLETED_SERVICE_FEE', 'TRANSACTION_COMPLETED_SHIPPING_FEE', 'TRANSACTION_CREATED_AMOUNT', 'TRANSACTION_CREATED_COUNT']):
                raise ValueError("each list item must be one of ('OFFER_PUBLISHED_AMOUNT', 'OFFER_CREATED_AMOUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_AMOUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_COUNT', 'TRANSACTION_ACCEPTED_PROPOSAL_SERVICE_FEE', 'TRANSACTION_ACCEPTED_PROPOSAL_SHIPPING_FEE', 'TRANSACTION_COMPLETED_AMOUNT', 'TRANSACTION_COMPLETED_COUNT', 'TRANSACTION_COMPLETED_SERVICE_FEE', 'TRANSACTION_COMPLETED_SHIPPING_FEE', 'TRANSACTION_CREATED_AMOUNT', 'TRANSACTION_CREATED_COUNT')")
        return value

    @field_validator('focus_type')
    def focus_type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['Organization', 'User', 'Persona']):
            raise ValueError("must be one of enum values ('Organization', 'User', 'Persona')")
        return value

    @field_validator('group_by_period')
    def group_by_period_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['DAILY', 'WEEKLY', 'MONTHLY', 'QUARTERLY', 'YEARLY']):
            raise ValueError("must be one of enum values ('DAILY', 'WEEKLY', 'MONTHLY', 'QUARTERLY', 'YEARLY')")
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
        """Create an instance of StatisticRead from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in data (list)
        _items = []
        if self.data:
            for _item_data in self.data:
                if _item_data:
                    _items.append(_item_data.to_dict())
            _dict['data'] = _items
        # set to None if focus_on (nullable) is None
        # and model_fields_set contains the field
        if self.focus_on is None and "focus_on" in self.model_fields_set:
            _dict['focusOn'] = None

        # set to None if focus_type (nullable) is None
        # and model_fields_set contains the field
        if self.focus_type is None and "focus_type" in self.model_fields_set:
            _dict['focusType'] = None

        # set to None if start_at (nullable) is None
        # and model_fields_set contains the field
        if self.start_at is None and "start_at" in self.model_fields_set:
            _dict['startAt'] = None

        # set to None if end_at (nullable) is None
        # and model_fields_set contains the field
        if self.end_at is None and "end_at" in self.model_fields_set:
            _dict['endAt'] = None

        # set to None if group_by_period (nullable) is None
        # and model_fields_set contains the field
        if self.group_by_period is None and "group_by_period" in self.model_fields_set:
            _dict['groupByPeriod'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of StatisticRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "request": obj.get("request"),
            "focusOn": obj.get("focusOn"),
            "focusType": obj.get("focusType"),
            "startAt": obj.get("startAt"),
            "endAt": obj.get("endAt"),
            "groupByPeriod": obj.get("groupByPeriod"),
            "data": [StatisticReadDataInner.from_dict(_item) for _item in obj["data"]] if obj.get("data") is not None else None
        })
        return _obj


