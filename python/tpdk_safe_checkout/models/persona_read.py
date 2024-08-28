# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.24
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
from tpdk_safe_checkout.models.persona_address_read import PersonaAddressRead
from tpdk_safe_checkout.models.persona_metadata_read import PersonaMetadataRead
from typing import Optional, Set
from typing_extensions import Self

class PersonaRead(BaseModel):
    """
    
    """ # noqa: E501
    id: Optional[StrictInt] = None
    first_name: Optional[StrictStr] = Field(default=None, alias="firstName")
    last_name: Optional[StrictStr] = Field(default=None, alias="lastName")
    gender: Optional[StrictStr] = 'RATHER_NOT_SAY'
    date_of_birth: Optional[Any] = Field(default=None, alias="dateOfBirth")
    language: Optional[StrictStr] = Field(default=None, description="That data is used for rendering the frontend application with given language. If not set, will be inferred. Custom codes can be issued for specific requirements.")
    email: Optional[StrictStr] = None
    mobile_phone_number: Optional[StrictStr] = Field(default=None, alias="mobilePhoneNumber")
    address: Optional[PersonaAddressRead] = None
    metadata: Optional[List[PersonaMetadataRead]] = Field(default=None, description="You can assign different meta to your Persona object for different purposes. eg. Ease searching.")
    created_at: Optional[datetime] = Field(default=None, alias="createdAt")
    updated_at: Optional[datetime] = Field(default=None, alias="updatedAt")
    offer_count: Optional[StrictInt] = Field(default=None, description="Issued Offers count owned by a given Persona", alias="offerCount")
    purchase_count: Optional[StrictInt] = Field(default=None, alias="purchaseCount")
    registered: Optional[StrictBool] = Field(default=None, description="Determine if the Persona have a Tripartie account")
    __properties: ClassVar[List[str]] = ["id", "firstName", "lastName", "gender", "dateOfBirth", "language", "email", "mobilePhoneNumber", "address", "metadata", "createdAt", "updatedAt", "offerCount", "purchaseCount", "registered"]

    @field_validator('gender')
    def gender_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['MALE', 'FEMALE', 'OTHER', 'RATHER_NOT_SAY']):
            raise ValueError("must be one of enum values ('MALE', 'FEMALE', 'OTHER', 'RATHER_NOT_SAY')")
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
        """Create an instance of PersonaRead from a JSON string"""
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
            "offer_count",
            "purchase_count",
            "registered",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of address
        if self.address:
            _dict['address'] = self.address.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in metadata (list)
        _items = []
        if self.metadata:
            for _item_metadata in self.metadata:
                if _item_metadata:
                    _items.append(_item_metadata.to_dict())
            _dict['metadata'] = _items
        # set to None if date_of_birth (nullable) is None
        # and model_fields_set contains the field
        if self.date_of_birth is None and "date_of_birth" in self.model_fields_set:
            _dict['dateOfBirth'] = None

        # set to None if language (nullable) is None
        # and model_fields_set contains the field
        if self.language is None and "language" in self.model_fields_set:
            _dict['language'] = None

        # set to None if email (nullable) is None
        # and model_fields_set contains the field
        if self.email is None and "email" in self.model_fields_set:
            _dict['email'] = None

        # set to None if mobile_phone_number (nullable) is None
        # and model_fields_set contains the field
        if self.mobile_phone_number is None and "mobile_phone_number" in self.model_fields_set:
            _dict['mobilePhoneNumber'] = None

        # set to None if address (nullable) is None
        # and model_fields_set contains the field
        if self.address is None and "address" in self.model_fields_set:
            _dict['address'] = None

        # set to None if updated_at (nullable) is None
        # and model_fields_set contains the field
        if self.updated_at is None and "updated_at" in self.model_fields_set:
            _dict['updatedAt'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of PersonaRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "id": obj.get("id"),
            "firstName": obj.get("firstName"),
            "lastName": obj.get("lastName"),
            "gender": obj.get("gender") if obj.get("gender") is not None else 'RATHER_NOT_SAY',
            "dateOfBirth": obj.get("dateOfBirth"),
            "language": obj.get("language"),
            "email": obj.get("email"),
            "mobilePhoneNumber": obj.get("mobilePhoneNumber"),
            "address": PersonaAddressRead.from_dict(obj["address"]) if obj.get("address") is not None else None,
            "metadata": [PersonaMetadataRead.from_dict(_item) for _item in obj["metadata"]] if obj.get("metadata") is not None else None,
            "createdAt": obj.get("createdAt"),
            "updatedAt": obj.get("updatedAt"),
            "offerCount": obj.get("offerCount"),
            "purchaseCount": obj.get("purchaseCount"),
            "registered": obj.get("registered")
        })
        return _obj


