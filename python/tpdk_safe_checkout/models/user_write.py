# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.51
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from typing import Optional, Set
from typing_extensions import Self

class UserWrite(BaseModel):
    """
    
    """ # noqa: E501
    captcha: Optional[StrictStr]
    first_name: Annotated[str, Field(min_length=1, strict=True, max_length=64)] = Field(alias="firstName")
    last_name: Annotated[str, Field(min_length=1, strict=True, max_length=64)] = Field(alias="lastName")
    public_name: Optional[Annotated[str, Field(min_length=2, strict=True, max_length=32)]] = Field(default=None, alias="publicName")
    role_in_company: Optional[Annotated[str, Field(min_length=2, strict=True, max_length=32)]] = Field(default=None, alias="roleInCompany")
    birthday: Optional[datetime]
    email: Annotated[str, Field(strict=True, max_length=180)]
    plain_password: Optional[Annotated[str, Field(min_length=6, strict=True, max_length=64)]] = Field(alias="plainPassword")
    intl_phone_number: Optional[StrictStr] = Field(default=None, alias="intlPhoneNumber")
    origin_country: Optional[StrictStr] = Field(description="The nationality of the current user.", alias="originCountry")
    home_country: Optional[StrictStr] = Field(description="The originating country", alias="homeCountry")
    preferred_language: Optional[StrictStr] = Field(default=None, alias="preferredLanguage")
    consent_mail_ads: Optional[StrictBool] = Field(default=None, alias="consentMailAds")
    time_zone_offset: Optional[StrictInt] = Field(default=None, description="Timezone offset. Expressed in minutes. Used for DT conversion and fraud prevention.", alias="timeZoneOffset")
    __properties: ClassVar[List[str]] = ["captcha", "firstName", "lastName", "publicName", "roleInCompany", "birthday", "email", "plainPassword", "intlPhoneNumber", "originCountry", "homeCountry", "preferredLanguage", "consentMailAds", "timeZoneOffset"]

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
        """Create an instance of UserWrite from a JSON string"""
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
        # set to None if captcha (nullable) is None
        # and model_fields_set contains the field
        if self.captcha is None and "captcha" in self.model_fields_set:
            _dict['captcha'] = None

        # set to None if public_name (nullable) is None
        # and model_fields_set contains the field
        if self.public_name is None and "public_name" in self.model_fields_set:
            _dict['publicName'] = None

        # set to None if role_in_company (nullable) is None
        # and model_fields_set contains the field
        if self.role_in_company is None and "role_in_company" in self.model_fields_set:
            _dict['roleInCompany'] = None

        # set to None if birthday (nullable) is None
        # and model_fields_set contains the field
        if self.birthday is None and "birthday" in self.model_fields_set:
            _dict['birthday'] = None

        # set to None if plain_password (nullable) is None
        # and model_fields_set contains the field
        if self.plain_password is None and "plain_password" in self.model_fields_set:
            _dict['plainPassword'] = None

        # set to None if intl_phone_number (nullable) is None
        # and model_fields_set contains the field
        if self.intl_phone_number is None and "intl_phone_number" in self.model_fields_set:
            _dict['intlPhoneNumber'] = None

        # set to None if origin_country (nullable) is None
        # and model_fields_set contains the field
        if self.origin_country is None and "origin_country" in self.model_fields_set:
            _dict['originCountry'] = None

        # set to None if home_country (nullable) is None
        # and model_fields_set contains the field
        if self.home_country is None and "home_country" in self.model_fields_set:
            _dict['homeCountry'] = None

        # set to None if preferred_language (nullable) is None
        # and model_fields_set contains the field
        if self.preferred_language is None and "preferred_language" in self.model_fields_set:
            _dict['preferredLanguage'] = None

        # set to None if time_zone_offset (nullable) is None
        # and model_fields_set contains the field
        if self.time_zone_offset is None and "time_zone_offset" in self.model_fields_set:
            _dict['timeZoneOffset'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UserWrite from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "captcha": obj.get("captcha"),
            "firstName": obj.get("firstName"),
            "lastName": obj.get("lastName"),
            "publicName": obj.get("publicName"),
            "roleInCompany": obj.get("roleInCompany"),
            "birthday": obj.get("birthday"),
            "email": obj.get("email"),
            "plainPassword": obj.get("plainPassword"),
            "intlPhoneNumber": obj.get("intlPhoneNumber"),
            "originCountry": obj.get("originCountry"),
            "homeCountry": obj.get("homeCountry"),
            "preferredLanguage": obj.get("preferredLanguage"),
            "consentMailAds": obj.get("consentMailAds"),
            "timeZoneOffset": obj.get("timeZoneOffset")
        })
        return _obj


