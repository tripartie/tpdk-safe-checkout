# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.54
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class WebhookHistoryCollectionRead(BaseModel):
    """
    
    """ # noqa: E501
    id: Optional[StrictInt] = None
    object_id: Optional[StrictStr] = Field(default=None, alias="objectId")
    event: StrictStr
    response_code: Optional[StrictInt] = Field(default=None, alias="responseCode")
    occurred_at: datetime = Field(alias="occurredAt")
    created_at: Optional[datetime] = Field(default=None, alias="createdAt")
    attempted_at: Optional[datetime] = Field(default=None, alias="attemptedAt")
    retry_count: StrictInt = Field(alias="retryCount")
    in_progress: Optional[StrictBool] = Field(default=None, alias="inProgress")
    __properties: ClassVar[List[str]] = ["id", "objectId", "event", "responseCode", "occurredAt", "createdAt", "attemptedAt", "retryCount", "inProgress"]

    @field_validator('event')
    def event_validate_enum(cls, value):
        """Validates the enum"""
        if value not in set(['offer.transaction.authorized', 'offer.transaction.accepted', 'offer.transaction.shipped', 'offer.transaction.delivered', 'offer.transaction.completed', 'offer.transaction.canceled', 'offer.transaction.disputed', 'offer.closed', 'persona.added']):
            raise ValueError("must be one of enum values ('offer.transaction.authorized', 'offer.transaction.accepted', 'offer.transaction.shipped', 'offer.transaction.delivered', 'offer.transaction.completed', 'offer.transaction.canceled', 'offer.transaction.disputed', 'offer.closed', 'persona.added')")
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
        """Create an instance of WebhookHistoryCollectionRead from a JSON string"""
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
            "id",
            "created_at",
            "attempted_at",
            "in_progress",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # set to None if object_id (nullable) is None
        # and model_fields_set contains the field
        if self.object_id is None and "object_id" in self.model_fields_set:
            _dict['objectId'] = None

        # set to None if response_code (nullable) is None
        # and model_fields_set contains the field
        if self.response_code is None and "response_code" in self.model_fields_set:
            _dict['responseCode'] = None

        # set to None if attempted_at (nullable) is None
        # and model_fields_set contains the field
        if self.attempted_at is None and "attempted_at" in self.model_fields_set:
            _dict['attemptedAt'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of WebhookHistoryCollectionRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "objectId": obj.get("objectId"),
            "event": obj.get("event"),
            "responseCode": obj.get("responseCode"),
            "occurredAt": obj.get("occurredAt"),
            "createdAt": obj.get("createdAt"),
            "attemptedAt": obj.get("attemptedAt"),
            "retryCount": obj.get("retryCount"),
            "inProgress": obj.get("inProgress")
        })
        return _obj


