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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from tpdk_safe_checkout.models.organization_media_read import OrganizationMediaRead
from typing import Optional, Set
from typing_extensions import Self

class OrganizationRead(BaseModel):
    """
    
    """ # noqa: E501
    name: Optional[StrictStr] = None
    vat_number: Optional[StrictStr] = Field(default=None, alias="vatNumber")
    commercial_registry_number: Optional[StrictStr] = Field(default=None, alias="commercialRegistryNumber")
    website_url: Optional[StrictStr] = Field(default=None, alias="websiteUrl")
    custom_base_url: Optional[StrictStr] = Field(default=None, alias="customBaseUrl")
    domain_verified: StrictBool = Field(alias="domainVerified")
    icon: Optional[OrganizationMediaRead] = None
    logo: Optional[OrganizationMediaRead] = None
    primary_color: Optional[StrictStr] = Field(default=None, alias="primaryColor")
    __properties: ClassVar[List[str]] = ["name", "vatNumber", "commercialRegistryNumber", "websiteUrl", "customBaseUrl", "domainVerified", "icon", "logo", "primaryColor"]

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
        """Create an instance of OrganizationRead from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of icon
        if self.icon:
            _dict['icon'] = self.icon.to_dict()
        # override the default output from pydantic by calling `to_dict()` of logo
        if self.logo:
            _dict['logo'] = self.logo.to_dict()
        # set to None if vat_number (nullable) is None
        # and model_fields_set contains the field
        if self.vat_number is None and "vat_number" in self.model_fields_set:
            _dict['vatNumber'] = None

        # set to None if website_url (nullable) is None
        # and model_fields_set contains the field
        if self.website_url is None and "website_url" in self.model_fields_set:
            _dict['websiteUrl'] = None

        # set to None if custom_base_url (nullable) is None
        # and model_fields_set contains the field
        if self.custom_base_url is None and "custom_base_url" in self.model_fields_set:
            _dict['customBaseUrl'] = None

        # set to None if icon (nullable) is None
        # and model_fields_set contains the field
        if self.icon is None and "icon" in self.model_fields_set:
            _dict['icon'] = None

        # set to None if logo (nullable) is None
        # and model_fields_set contains the field
        if self.logo is None and "logo" in self.model_fields_set:
            _dict['logo'] = None

        # set to None if primary_color (nullable) is None
        # and model_fields_set contains the field
        if self.primary_color is None and "primary_color" in self.model_fields_set:
            _dict['primaryColor'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of OrganizationRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "name": obj.get("name"),
            "vatNumber": obj.get("vatNumber"),
            "commercialRegistryNumber": obj.get("commercialRegistryNumber"),
            "websiteUrl": obj.get("websiteUrl"),
            "customBaseUrl": obj.get("customBaseUrl"),
            "domainVerified": obj.get("domainVerified"),
            "icon": OrganizationMediaRead.from_dict(obj["icon"]) if obj.get("icon") is not None else None,
            "logo": OrganizationMediaRead.from_dict(obj["logo"]) if obj.get("logo") is not None else None,
            "primaryColor": obj.get("primaryColor")
        })
        return _obj


