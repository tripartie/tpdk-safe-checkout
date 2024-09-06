# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.54
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.offer_organization_collection_read import OfferOrganizationCollectionRead

class TestOfferOrganizationCollectionRead(unittest.TestCase):
    """OfferOrganizationCollectionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> OfferOrganizationCollectionRead:
        """Test OfferOrganizationCollectionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `OfferOrganizationCollectionRead`
        """
        model = OfferOrganizationCollectionRead()
        if include_optional:
            return OfferOrganizationCollectionRead(
                name = '',
                website_url = '',
                icon = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                    id = 56, 
                    public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ),
                logo = tpdk_safe_checkout.models.offer_media_collection_read.Offer-Media-CollectionRead(
                    id = 56, 
                    public_url = 'https://cdn.tripartie.app/b15e64db-fbd2-442b-afee-69ee45e2959b.jpg', ),
                primary_color = ''
            )
        else:
            return OfferOrganizationCollectionRead(
        )
        """

    def testOfferOrganizationCollectionRead(self):
        """Test OfferOrganizationCollectionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
