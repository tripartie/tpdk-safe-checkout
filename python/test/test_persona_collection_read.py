# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.38
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.persona_collection_read import PersonaCollectionRead

class TestPersonaCollectionRead(unittest.TestCase):
    """PersonaCollectionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> PersonaCollectionRead:
        """Test PersonaCollectionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `PersonaCollectionRead`
        """
        model = PersonaCollectionRead()
        if include_optional:
            return PersonaCollectionRead(
                id = 56,
                first_name = 'John',
                last_name = 'Doe',
                email = 'john.doe@gmail.com',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                offer_count = 4,
                purchase_count = 42
            )
        else:
            return PersonaCollectionRead(
        )
        """

    def testPersonaCollectionRead(self):
        """Test PersonaCollectionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
