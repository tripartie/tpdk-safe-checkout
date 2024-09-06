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
from tpdk_safe_checkout.models.user_address_support_read import UserAddressSupportRead
from tpdk_safe_checkout.models.user_media_support_read import UserMediaSupportRead
from tpdk_safe_checkout.models.user_organization_support_read import UserOrganizationSupportRead
from tpdk_safe_checkout.models.user_wallet_support_read import UserWalletSupportRead
from typing import Optional, Set
from typing_extensions import Self

class UserSupportRead(BaseModel):
    """
    
    """ # noqa: E501
    id: Optional[StrictInt] = None
    main_address: Optional[UserAddressSupportRead] = Field(default=None, alias="mainAddress")
    first_name: Optional[StrictStr] = Field(default=None, alias="firstName")
    last_name: Optional[StrictStr] = Field(default=None, alias="lastName")
    public_name: Optional[StrictStr] = Field(default=None, alias="publicName")
    role_in_company: Optional[StrictStr] = Field(default=None, alias="roleInCompany")
    email: Optional[StrictStr] = None
    roles: List[StrictStr]
    totp_enabled: Optional[StrictBool] = Field(default=None, alias="totpEnabled")
    intl_phone_number: Optional[StrictStr] = Field(default=None, alias="intlPhoneNumber")
    last_successful_log_in: Optional[datetime] = Field(default=None, alias="lastSuccessfulLogIn")
    avatar: Optional[UserMediaSupportRead] = None
    created_at: Optional[datetime] = Field(default=None, alias="createdAt")
    updated_at: Optional[datetime] = Field(default=None, alias="updatedAt")
    time_zone_offset: Optional[StrictInt] = Field(default=None, description="Timezone offset. Expressed in minutes. Used for DT conversion and fraud prevention.", alias="timeZoneOffset")
    organization: Optional[UserOrganizationSupportRead] = None
    wallet: Optional[UserWalletSupportRead] = None
    external_id: Optional[StrictStr] = Field(default=None, alias="externalId")
    provider_name: Optional[StrictStr] = Field(default=None, alias="providerName")
    provider_created_at: Optional[datetime] = Field(default=None, alias="providerCreatedAt")
    provider_updated_at: Optional[datetime] = Field(default=None, alias="providerUpdatedAt")
    iri: Optional[StrictStr] = None
    second_auth_factor: Optional[StrictBool] = Field(default=None, alias="secondAuthFactor")
    processor_status: Optional[StrictStr] = Field(default=None, description="Automagically infer on what state the entity is at the Payment Processor.", alias="processorStatus")
    __properties: ClassVar[List[str]] = ["id", "mainAddress", "firstName", "lastName", "publicName", "roleInCompany", "email", "roles", "totpEnabled", "intlPhoneNumber", "lastSuccessfulLogIn", "avatar", "createdAt", "updatedAt", "timeZoneOffset", "organization", "wallet", "externalId", "providerName", "providerCreatedAt", "providerUpdatedAt", "iri", "secondAuthFactor", "processorStatus"]

    @field_validator('roles')
    def roles_validate_enum(cls, value):
        """Validates the enum"""
        for i in value:
            if i not in set(['ROLE_ORGANIZATION_OWNER', 'ROLE_ADMIN', 'ROLE_CONSULTANT', 'ROLE_ACCOUNTING_MANAGER', 'ROLE_BILLING_MANAGER', 'ROLE_CUSTOMER_SERVICE', 'ROLE_PLATFORM_SUPPORT', 'ROLE_PLATFORM_ADMIN', 'ROLE_USER']):
                raise ValueError("each list item must be one of ('ROLE_ORGANIZATION_OWNER', 'ROLE_ADMIN', 'ROLE_CONSULTANT', 'ROLE_ACCOUNTING_MANAGER', 'ROLE_BILLING_MANAGER', 'ROLE_CUSTOMER_SERVICE', 'ROLE_PLATFORM_SUPPORT', 'ROLE_PLATFORM_ADMIN', 'ROLE_USER')")
        return value

    @field_validator('processor_status')
    def processor_status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['unallocated', 'allocating', 'allocated', 'freed', 'outdated']):
            raise ValueError("must be one of enum values ('unallocated', 'allocating', 'allocated', 'freed', 'outdated')")
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
        """Create an instance of UserSupportRead from a JSON string"""
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
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "id",
            "created_at",
            "updated_at",
            "iri",
            "second_auth_factor",
            "processor_status",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of main_address
        if self.main_address:
            _dict['mainAddress'] = self.main_address.to_dict()
        # override the default output from pydantic by calling `to_dict()` of avatar
        if self.avatar:
            _dict['avatar'] = self.avatar.to_dict()
        # override the default output from pydantic by calling `to_dict()` of organization
        if self.organization:
            _dict['organization'] = self.organization.to_dict()
        # override the default output from pydantic by calling `to_dict()` of wallet
        if self.wallet:
            _dict['wallet'] = self.wallet.to_dict()
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

        # set to None if time_zone_offset (nullable) is None
        # and model_fields_set contains the field
        if self.time_zone_offset is None and "time_zone_offset" in self.model_fields_set:
            _dict['timeZoneOffset'] = None

        # set to None if organization (nullable) is None
        # and model_fields_set contains the field
        if self.organization is None and "organization" in self.model_fields_set:
            _dict['organization'] = None

        # set to None if wallet (nullable) is None
        # and model_fields_set contains the field
        if self.wallet is None and "wallet" in self.model_fields_set:
            _dict['wallet'] = None

        # set to None if external_id (nullable) is None
        # and model_fields_set contains the field
        if self.external_id is None and "external_id" in self.model_fields_set:
            _dict['externalId'] = None

        # set to None if provider_name (nullable) is None
        # and model_fields_set contains the field
        if self.provider_name is None and "provider_name" in self.model_fields_set:
            _dict['providerName'] = None

        # set to None if provider_created_at (nullable) is None
        # and model_fields_set contains the field
        if self.provider_created_at is None and "provider_created_at" in self.model_fields_set:
            _dict['providerCreatedAt'] = None

        # set to None if provider_updated_at (nullable) is None
        # and model_fields_set contains the field
        if self.provider_updated_at is None and "provider_updated_at" in self.model_fields_set:
            _dict['providerUpdatedAt'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of UserSupportRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "mainAddress": UserAddressSupportRead.from_dict(obj["mainAddress"]) if obj.get("mainAddress") is not None else None,
            "firstName": obj.get("firstName"),
            "lastName": obj.get("lastName"),
            "publicName": obj.get("publicName"),
            "roleInCompany": obj.get("roleInCompany"),
            "email": obj.get("email"),
            "roles": obj.get("roles"),
            "totpEnabled": obj.get("totpEnabled"),
            "intlPhoneNumber": obj.get("intlPhoneNumber"),
            "lastSuccessfulLogIn": obj.get("lastSuccessfulLogIn"),
            "avatar": UserMediaSupportRead.from_dict(obj["avatar"]) if obj.get("avatar") is not None else None,
            "createdAt": obj.get("createdAt"),
            "updatedAt": obj.get("updatedAt"),
            "timeZoneOffset": obj.get("timeZoneOffset"),
            "organization": UserOrganizationSupportRead.from_dict(obj["organization"]) if obj.get("organization") is not None else None,
            "wallet": UserWalletSupportRead.from_dict(obj["wallet"]) if obj.get("wallet") is not None else None,
            "externalId": obj.get("externalId"),
            "providerName": obj.get("providerName"),
            "providerCreatedAt": obj.get("providerCreatedAt"),
            "providerUpdatedAt": obj.get("providerUpdatedAt"),
            "iri": obj.get("iri"),
            "secondAuthFactor": obj.get("secondAuthFactor"),
            "processorStatus": obj.get("processorStatus")
        })
        return _obj


