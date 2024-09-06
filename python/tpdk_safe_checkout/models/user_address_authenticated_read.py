# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.50
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self

class UserAddressAuthenticatedRead(BaseModel):
    """
    
    """ # noqa: E501
    company_name: Optional[StrictStr] = Field(default=None, alias="companyName")
    country_code: Optional[Annotated[str, Field(strict=True, max_length=3)]] = Field(default=None, alias="countryCode")
    zip_code: Optional[StrictStr] = Field(default=None, alias="zipCode")
    city_name: Optional[StrictStr] = Field(default=None, alias="cityName")
    first_line: Optional[StrictStr] = Field(default=None, alias="firstLine")
    second_line: Optional[StrictStr] = Field(default=None, alias="secondLine")
    building_name: Optional[StrictStr] = Field(default=None, alias="buildingName")
    building_floor: Optional[StrictStr] = Field(default=None, alias="buildingFloor")
    gate_or_portal_or_inbox_code: Optional[StrictStr] = Field(default=None, alias="gateOrPortalOrInboxCode")
    formatted_address: Optional[StrictStr] = Field(default=None, alias="formattedAddress")
    __properties: ClassVar[List[str]] = ["companyName", "countryCode", "zipCode", "cityName", "firstLine", "secondLine", "buildingName", "buildingFloor", "gateOrPortalOrInboxCode", "formattedAddress"]

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
        """Create an instance of UserAddressAuthenticatedRead from a JSON string"""
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
            "formatted_address",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # set to None if company_name (nullable) is None
        # and model_fields_set contains the field
        if self.company_name is None and "company_name" in self.model_fields_set:
            _dict['companyName'] = None

        # set to None if second_line (nullable) is None
        # and model_fields_set contains the field
        if self.second_line is None and "second_line" in self.model_fields_set:
            _dict['secondLine'] = None

        # set to None if building_name (nullable) is None
        # and model_fields_set contains the field
        if self.building_name is None and "building_name" in self.model_fields_set:
            _dict['buildingName'] = None

        # set to None if building_floor (nullable) is None
        # and model_fields_set contains the field
        if self.building_floor is None and "building_floor" in self.model_fields_set:
            _dict['buildingFloor'] = None

        # set to None if gate_or_portal_or_inbox_code (nullable) is None
        # and model_fields_set contains the field
        if self.gate_or_portal_or_inbox_code is None and "gate_or_portal_or_inbox_code" in self.model_fields_set:
            _dict['gateOrPortalOrInboxCode'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UserAddressAuthenticatedRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "companyName": obj.get("companyName"),
            "countryCode": obj.get("countryCode"),
            "zipCode": obj.get("zipCode"),
            "cityName": obj.get("cityName"),
            "firstLine": obj.get("firstLine"),
            "secondLine": obj.get("secondLine"),
            "buildingName": obj.get("buildingName"),
            "buildingFloor": obj.get("buildingFloor"),
            "gateOrPortalOrInboxCode": obj.get("gateOrPortalOrInboxCode"),
            "formattedAddress": obj.get("formattedAddress")
        })
        return _obj


