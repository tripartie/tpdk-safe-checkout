# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.35
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
from tpdk_safe_checkout.models.user_address_update import UserAddressUpdate
from typing import Optional, Set
from typing_extensions import Self

class UserUpdate(BaseModel):
    """
    
    """ # noqa: E501
    main_address: Optional[UserAddressUpdate] = Field(default=None, alias="mainAddress")
    first_name: Optional[StrictStr] = Field(default=None, alias="firstName")
    last_name: Optional[StrictStr] = Field(default=None, alias="lastName")
    public_name: Optional[StrictStr] = Field(default=None, alias="publicName")
    role_in_company: Optional[StrictStr] = Field(default=None, alias="roleInCompany")
    birthday: Optional[datetime] = None
    intl_phone_number: Optional[StrictStr] = Field(default=None, alias="intlPhoneNumber")
    origin_country: Optional[Annotated[str, Field(strict=True, max_length=3)]] = Field(default=None, description="The nationality of the current user.", alias="originCountry")
    home_country: Optional[Annotated[str, Field(strict=True, max_length=3)]] = Field(default=None, description="The originating country", alias="homeCountry")
    preferred_language: Optional[Annotated[str, Field(strict=True, max_length=2)]] = Field(default=None, alias="preferredLanguage")
    consent_mail_ads: StrictBool = Field(alias="consentMailAds")
    time_zone_offset: Optional[StrictInt] = Field(default=None, description="Timezone offset. Expressed in minutes. Used for DT conversion and fraud prevention.", alias="timeZoneOffset")
    __properties: ClassVar[List[str]] = ["mainAddress", "firstName", "lastName", "publicName", "roleInCompany", "birthday", "intlPhoneNumber", "originCountry", "homeCountry", "preferredLanguage", "consentMailAds", "timeZoneOffset"]

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
        """Create an instance of UserUpdate from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of main_address
        if self.main_address:
            _dict['mainAddress'] = self.main_address.to_dict()
        # set to None if main_address (nullable) is None
        # and model_fields_set contains the field
        if self.main_address is None and "main_address" in self.model_fields_set:
            _dict['mainAddress'] = None

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
        """Create an instance of UserUpdate from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "mainAddress": UserAddressUpdate.from_dict(obj["mainAddress"]) if obj.get("mainAddress") is not None else None,
            "firstName": obj.get("firstName"),
            "lastName": obj.get("lastName"),
            "publicName": obj.get("publicName"),
            "roleInCompany": obj.get("roleInCompany"),
            "birthday": obj.get("birthday"),
            "intlPhoneNumber": obj.get("intlPhoneNumber"),
            "originCountry": obj.get("originCountry"),
            "homeCountry": obj.get("homeCountry"),
            "preferredLanguage": obj.get("preferredLanguage"),
            "consentMailAds": obj.get("consentMailAds"),
            "timeZoneOffset": obj.get("timeZoneOffset")
        })
        return _obj


