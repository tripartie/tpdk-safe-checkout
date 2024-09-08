# coding: utf-8

"""
    Safe Checkout

    Simple, yet elegant web interfaces for your convenience. One request away from your first secured C2C transaction.

    The version of the OpenAPI document: 2.0.58
    Contact: noc@tripartie.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from tpdk_safe_checkout.models.proof_of_identity_collection_read import ProofOfIdentityCollectionRead

class TestProofOfIdentityCollectionRead(unittest.TestCase):
    """ProofOfIdentityCollectionRead unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ProofOfIdentityCollectionRead:
        """Test ProofOfIdentityCollectionRead
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ProofOfIdentityCollectionRead`
        """
        model = ProofOfIdentityCollectionRead()
        if include_optional:
            return ProofOfIdentityCollectionRead(
                id = 56,
                status = 'drafted',
                type = 'national_id',
                original_filename = '',
                extension = '',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                provider_name = '',
                provider_created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                provider_updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                processor_status = 'unallocated'
            )
        else:
            return ProofOfIdentityCollectionRead(
                status = 'drafted',
                type = 'national_id',
                created_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
                updated_at = datetime.datetime.strptime('2013-10-20 19:20:30.00', '%Y-%m-%d %H:%M:%S.%f'),
        )
        """

    def testProofOfIdentityCollectionRead(self):
        """Test ProofOfIdentityCollectionRead"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
