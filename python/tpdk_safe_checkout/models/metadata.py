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

from pydantic import BaseModel, ConfigDict, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class Metadata(BaseModel):
    """
    
    """ # noqa: E501
    id: Optional[StrictInt] = None
    persona: Optional[StrictStr] = None
    offer: Optional[StrictStr] = None
    card: Optional[StrictStr] = None
    transaction: Optional[StrictStr] = None
    key: Optional[StrictStr] = None
    value: Optional[StrictStr] = None
    __properties: ClassVar[List[str]] = ["id", "persona", "offer", "card", "transaction", "key", "value"]

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
        """Create an instance of Metadata from a JSON string"""
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
            "id",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # set to None if persona (nullable) is None
        # and model_fields_set contains the field
        if self.persona is None and "persona" in self.model_fields_set:
            _dict['persona'] = None

        # set to None if offer (nullable) is None
        # and model_fields_set contains the field
        if self.offer is None and "offer" in self.model_fields_set:
            _dict['offer'] = None

        # set to None if card (nullable) is None
        # and model_fields_set contains the field
        if self.card is None and "card" in self.model_fields_set:
            _dict['card'] = None

        # set to None if transaction (nullable) is None
        # and model_fields_set contains the field
        if self.transaction is None and "transaction" in self.model_fields_set:
            _dict['transaction'] = None

        # set to None if value (nullable) is None
        # and model_fields_set contains the field
        if self.value is None and "value" in self.model_fields_set:
            _dict['value'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Metadata from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "persona": obj.get("persona"),
            "offer": obj.get("offer"),
            "card": obj.get("card"),
            "transaction": obj.get("transaction"),
            "key": obj.get("key"),
            "value": obj.get("value")
        })
        return _obj


