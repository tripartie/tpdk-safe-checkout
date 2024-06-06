# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.11
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
from tpdk_safe_checkout.models.user_media_collection_read import UserMediaCollectionRead
from tpdk_safe_checkout.models.user_organization_collection_read import UserOrganizationCollectionRead
from tpdk_safe_checkout.models.user_wallet_collection_read import UserWalletCollectionRead
from typing import Optional, Set
from typing_extensions import Self

class UserCollectionRead(BaseModel):
    """
    
    """ # noqa: E501
    id: Optional[StrictInt] = None
    first_name: Optional[StrictStr] = Field(default=None, alias="firstName")
    last_name: Optional[StrictStr] = Field(default=None, alias="lastName")
    public_name: Optional[StrictStr] = Field(default=None, alias="publicName")
    role_in_company: Optional[StrictStr] = Field(default=None, alias="roleInCompany")
    email: Optional[StrictStr] = None
    roles: List[StrictStr]
    totp_enabled: Optional[StrictBool] = Field(default=None, alias="totpEnabled")
    intl_phone_number: Optional[StrictStr] = Field(default=None, alias="intlPhoneNumber")
    last_successful_log_in: Optional[datetime] = Field(default=None, alias="lastSuccessfulLogIn")
    avatar: Optional[UserMediaCollectionRead] = None
    created_at: Optional[datetime] = Field(default=None, alias="createdAt")
    updated_at: Optional[datetime] = Field(default=None, alias="updatedAt")
    organization: Optional[UserOrganizationCollectionRead] = None
    wallet: Optional[UserWalletCollectionRead] = None
    iri: Optional[StrictStr] = None
    second_auth_factor: Optional[StrictBool] = Field(default=None, alias="secondAuthFactor")
    __properties: ClassVar[List[str]] = ["id", "firstName", "lastName", "publicName", "roleInCompany", "email", "roles", "totpEnabled", "intlPhoneNumber", "lastSuccessfulLogIn", "avatar", "createdAt", "updatedAt", "organization", "wallet", "iri", "secondAuthFactor"]

    @field_validator('roles')
    def roles_validate_enum(cls, value):
        """Validates the enum"""
        for i in value:
            if i not in set(['ROLE_ORGANIZATION_OWNER', 'ROLE_ADMIN', 'ROLE_CONSULTANT', 'ROLE_ACCOUNTING_MANAGER', 'ROLE_BILLING_MANAGER', 'ROLE_CUSTOMER_SERVICE', 'ROLE_PLATFORM_SUPPORT', 'ROLE_PLATFORM_ADMIN', 'ROLE_USER']):
                raise ValueError("each list item must be one of ('ROLE_ORGANIZATION_OWNER', 'ROLE_ADMIN', 'ROLE_CONSULTANT', 'ROLE_ACCOUNTING_MANAGER', 'ROLE_BILLING_MANAGER', 'ROLE_CUSTOMER_SERVICE', 'ROLE_PLATFORM_SUPPORT', 'ROLE_PLATFORM_ADMIN', 'ROLE_USER')")
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
        """Create an instance of UserCollectionRead from a JSON string"""
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
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "id",
            "created_at",
            "updated_at",
            "iri",
            "second_auth_factor",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of avatar
        if self.avatar:
            _dict['avatar'] = self.avatar.to_dict()
        # override the default output from pydantic by calling `to_dict()` of organization
        if self.organization:
            _dict['organization'] = self.organization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of wallet
        if self.wallet:
            _dict['wallet'] = self.wallet.to_dict()
        # set to None if public_name (nullable) is None
        # and model_fields_set contains the field
        if self.public_name is None and "public_name" in self.model_fields_set:
            _dict['publicName'] = None

        # set to None if role_in_company (nullable) is None
        # and model_fields_set contains the field
        if self.role_in_company is None and "role_in_company" in self.model_fields_set:
            _dict['roleInCompany'] = None

        # set to None if intl_phone_number (nullable) is None
        # and model_fields_set contains the field
        if self.intl_phone_number is None and "intl_phone_number" in self.model_fields_set:
            _dict['intlPhoneNumber'] = None

        # set to None if last_successful_log_in (nullable) is None
        # and model_fields_set contains the field
        if self.last_successful_log_in is None and "last_successful_log_in" in self.model_fields_set:
            _dict['lastSuccessfulLogIn'] = None

        # set to None if avatar (nullable) is None
        # and model_fields_set contains the field
        if self.avatar is None and "avatar" in self.model_fields_set:
            _dict['avatar'] = None

        # set to None if organization (nullable) is None
        # and model_fields_set contains the field
        if self.organization is None and "organization" in self.model_fields_set:
            _dict['organization'] = None

        # set to None if wallet (nullable) is None
        # and model_fields_set contains the field
        if self.wallet is None and "wallet" in self.model_fields_set:
            _dict['wallet'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UserCollectionRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "firstName": obj.get("firstName"),
            "lastName": obj.get("lastName"),
            "publicName": obj.get("publicName"),
            "roleInCompany": obj.get("roleInCompany"),
            "email": obj.get("email"),
            "roles": obj.get("roles"),
            "totpEnabled": obj.get("totpEnabled"),
            "intlPhoneNumber": obj.get("intlPhoneNumber"),
            "lastSuccessfulLogIn": obj.get("lastSuccessfulLogIn"),
            "avatar": UserMediaCollectionRead.from_dict(obj["avatar"]) if obj.get("avatar") is not None else None,
            "createdAt": obj.get("createdAt"),
            "updatedAt": obj.get("updatedAt"),
            "organization": UserOrganizationCollectionRead.from_dict(obj["organization"]) if obj.get("organization") is not None else None,
            "wallet": UserWalletCollectionRead.from_dict(obj["wallet"]) if obj.get("wallet") is not None else None,
            "iri": obj.get("iri"),
            "secondAuthFactor": obj.get("secondAuthFactor")
        })
        return _obj


