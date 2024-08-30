# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.30
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from datetime import datetime
from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictFloat, StrictInt, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional, Union
from tpdk_safe_checkout.models.transaction_card_read import TransactionCardRead
from tpdk_safe_checkout.models.transaction_offer_read import TransactionOfferRead
from tpdk_safe_checkout.models.transaction_parcel_read import TransactionParcelRead
from tpdk_safe_checkout.models.transaction_persona_read import TransactionPersonaRead
from tpdk_safe_checkout.models.transaction_quote_read import TransactionQuoteRead
from tpdk_safe_checkout.models.transaction_wallet_read import TransactionWalletRead
from typing import Optional, Set
from typing_extensions import Self

class TransactionRead(BaseModel):
    """
    
    """ # noqa: E501
    ulid: StrictStr
    offer: TransactionOfferRead
    quote: TransactionQuoteRead
    buyer: TransactionPersonaRead
    status: Optional[StrictStr] = None
    fees: Optional[Union[StrictFloat, StrictInt]] = None
    supplemental_fees: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="supplementalFees")
    card: Optional[TransactionCardRead] = None
    escrow: Optional[TransactionWalletRead] = None
    remote_pre_authorization_id: Optional[StrictStr] = Field(default=None, alias="remotePreAuthorizationId")
    remote_pay_in_id: Optional[StrictStr] = Field(default=None, alias="remotePayInId")
    balance_to_refund: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="balanceToRefund")
    fees_to_refund: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="feesToRefund")
    force_refund_shipping: Optional[StrictBool] = Field(default=None, description="Shipping is never refunded on purpose. Once deposited (parcel), we are billed for it.", alias="forceRefundShipping")
    review: Optional[StrictStr] = None
    rating: Optional[StrictInt] = None
    hand_over_code: Optional[StrictStr] = Field(default=None, alias="handOverCode")
    parcels: Optional[List[TransactionParcelRead]] = None
    created_at: datetime = Field(alias="createdAt")
    updated_at: Optional[datetime] = Field(default=None, alias="updatedAt")
    provider_name: Optional[StrictStr] = Field(default=None, alias="providerName")
    provider_created_at: Optional[datetime] = Field(default=None, alias="providerCreatedAt")
    provider_updated_at: Optional[datetime] = Field(default=None, alias="providerUpdatedAt")
    total: Optional[Union[StrictFloat, StrictInt]] = None
    total_charged: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="totalCharged")
    total_fees: Optional[Union[StrictFloat, StrictInt]] = Field(default=None, alias="totalFees")
    awaited_party: Optional[StrictStr] = Field(default=None, description="Determine who is awaited (actor) for the next transition", alias="awaitedParty")
    status_expiration: Optional[datetime] = Field(default=None, description="Yield if eligible the date-time at which the transaction state expire.", alias="statusExpiration")
    processor_status: Optional[StrictStr] = Field(default=None, description="Automagically infer on what state the entity is at the Payment Processor.", alias="processorStatus")
    __properties: ClassVar[List[str]] = ["ulid", "offer", "quote", "buyer", "status", "fees", "supplementalFees", "card", "escrow", "remotePreAuthorizationId", "remotePayInId", "balanceToRefund", "feesToRefund", "forceRefundShipping", "review", "rating", "handOverCode", "parcels", "createdAt", "updatedAt", "providerName", "providerCreatedAt", "providerUpdatedAt", "total", "totalCharged", "totalFees", "awaitedParty", "statusExpiration", "processorStatus"]

    @field_validator('status')
    def status_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['CREATED', 'AUTHORIZED', 'REFUSED', 'ACCEPTED', 'SHIPPED', 'IN_TRANSIT', 'BLOCKED', 'DELIVERED', 'COMPLETED', 'DISPUTED', 'CANCELLED', 'null']):
            raise ValueError("must be one of enum values ('CREATED', 'AUTHORIZED', 'REFUSED', 'ACCEPTED', 'SHIPPED', 'IN_TRANSIT', 'BLOCKED', 'DELIVERED', 'COMPLETED', 'DISPUTED', 'CANCELLED', 'null')")
        return value

    @field_validator('awaited_party')
    def awaited_party_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['BUYER', 'PLATFORM', 'SELLER']):
            raise ValueError("must be one of enum values ('BUYER', 'PLATFORM', 'SELLER')")
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
        """Create an instance of TransactionRead from a JSON string"""
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
        * OpenAPI `readOnly` fields are excluded.
        * OpenAPI `readOnly` fields are excluded.
        """
        excluded_fields: Set[str] = set([
            "provider_created_at",
            "provider_updated_at",
            "total",
            "total_charged",
            "total_fees",
            "awaited_party",
            "status_expiration",
            "processor_status",
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        # override the default output from pydantic by calling `to_dict()` of offer
        if self.offer:
            _dict['offer'] = self.offer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of quote
        if self.quote:
            _dict['quote'] = self.quote.to_dict()
        # override the default output from pydantic by calling `to_dict()` of buyer
        if self.buyer:
            _dict['buyer'] = self.buyer.to_dict()
        # override the default output from pydantic by calling `to_dict()` of card
        if self.card:
            _dict['card'] = self.card.to_dict()
        # override the default output from pydantic by calling `to_dict()` of escrow
        if self.escrow:
            _dict['escrow'] = self.escrow.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in parcels (list)
        _items = []
        if self.parcels:
            for _item_parcels in self.parcels:
                if _item_parcels:
                    _items.append(_item_parcels.to_dict())
            _dict['parcels'] = _items
        # set to None if status (nullable) is None
        # and model_fields_set contains the field
        if self.status is None and "status" in self.model_fields_set:
            _dict['status'] = None

        # set to None if fees (nullable) is None
        # and model_fields_set contains the field
        if self.fees is None and "fees" in self.model_fields_set:
            _dict['fees'] = None

        # set to None if supplemental_fees (nullable) is None
        # and model_fields_set contains the field
        if self.supplemental_fees is None and "supplemental_fees" in self.model_fields_set:
            _dict['supplementalFees'] = None

        # set to None if escrow (nullable) is None
        # and model_fields_set contains the field
        if self.escrow is None and "escrow" in self.model_fields_set:
            _dict['escrow'] = None

        # set to None if remote_pre_authorization_id (nullable) is None
        # and model_fields_set contains the field
        if self.remote_pre_authorization_id is None and "remote_pre_authorization_id" in self.model_fields_set:
            _dict['remotePreAuthorizationId'] = None

        # set to None if remote_pay_in_id (nullable) is None
        # and model_fields_set contains the field
        if self.remote_pay_in_id is None and "remote_pay_in_id" in self.model_fields_set:
            _dict['remotePayInId'] = None

        # set to None if balance_to_refund (nullable) is None
        # and model_fields_set contains the field
        if self.balance_to_refund is None and "balance_to_refund" in self.model_fields_set:
            _dict['balanceToRefund'] = None

        # set to None if fees_to_refund (nullable) is None
        # and model_fields_set contains the field
        if self.fees_to_refund is None and "fees_to_refund" in self.model_fields_set:
            _dict['feesToRefund'] = None

        # set to None if force_refund_shipping (nullable) is None
        # and model_fields_set contains the field
        if self.force_refund_shipping is None and "force_refund_shipping" in self.model_fields_set:
            _dict['forceRefundShipping'] = None

        # set to None if review (nullable) is None
        # and model_fields_set contains the field
        if self.review is None and "review" in self.model_fields_set:
            _dict['review'] = None

        # set to None if rating (nullable) is None
        # and model_fields_set contains the field
        if self.rating is None and "rating" in self.model_fields_set:
            _dict['rating'] = None

        # set to None if hand_over_code (nullable) is None
        # and model_fields_set contains the field
        if self.hand_over_code is None and "hand_over_code" in self.model_fields_set:
            _dict['handOverCode'] = None

        # set to None if updated_at (nullable) is None
        # and model_fields_set contains the field
        if self.updated_at is None and "updated_at" in self.model_fields_set:
            _dict['updatedAt'] = None

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

        # set to None if status_expiration (nullable) is None
        # and model_fields_set contains the field
        if self.status_expiration is None and "status_expiration" in self.model_fields_set:
            _dict['statusExpiration'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of TransactionRead from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ulid": obj.get("ulid"),
            "offer": TransactionOfferRead.from_dict(obj["offer"]) if obj.get("offer") is not None else None,
            "quote": TransactionQuoteRead.from_dict(obj["quote"]) if obj.get("quote") is not None else None,
            "buyer": TransactionPersonaRead.from_dict(obj["buyer"]) if obj.get("buyer") is not None else None,
            "status": obj.get("status"),
            "fees": obj.get("fees"),
            "supplementalFees": obj.get("supplementalFees"),
            "card": TransactionCardRead.from_dict(obj["card"]) if obj.get("card") is not None else None,
            "escrow": TransactionWalletRead.from_dict(obj["escrow"]) if obj.get("escrow") is not None else None,
            "remotePreAuthorizationId": obj.get("remotePreAuthorizationId"),
            "remotePayInId": obj.get("remotePayInId"),
            "balanceToRefund": obj.get("balanceToRefund"),
            "feesToRefund": obj.get("feesToRefund"),
            "forceRefundShipping": obj.get("forceRefundShipping"),
            "review": obj.get("review"),
            "rating": obj.get("rating"),
            "handOverCode": obj.get("handOverCode"),
            "parcels": [TransactionParcelRead.from_dict(_item) for _item in obj["parcels"]] if obj.get("parcels") is not None else None,
            "createdAt": obj.get("createdAt"),
            "updatedAt": obj.get("updatedAt"),
            "providerName": obj.get("providerName"),
            "providerCreatedAt": obj.get("providerCreatedAt"),
            "providerUpdatedAt": obj.get("providerUpdatedAt"),
            "total": obj.get("total"),
            "totalCharged": obj.get("totalCharged"),
            "totalFees": obj.get("totalFees"),
            "awaitedParty": obj.get("awaitedParty"),
            "statusExpiration": obj.get("statusExpiration"),
            "processorStatus": obj.get("processorStatus")
        })
        return _obj


